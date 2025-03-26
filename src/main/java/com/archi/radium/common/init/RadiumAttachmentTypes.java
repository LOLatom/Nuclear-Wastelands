package com.archi.radium.common.init;

import com.archi.radium.RadiumMod;
import com.archi.radium.api.radiations.RadiationEmission;
import com.archi.radium.api.radiations.RadiationEmissionManager;
import com.archi.radium.api.radiations.RadiationReceiver;
import com.mojang.serialization.Dynamic;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.attachment.IAttachmentHolder;
import net.neoforged.neoforge.attachment.IAttachmentSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadiumAttachmentTypes {
    public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES,RadiumMod.MODID);

    public static final DeferredHolder<AttachmentType<?>,AttachmentType<HashMap<BlockPos, List<RadiationEmission>>>> PERMANENT_RADIATION_EMITTERS = ATTACHMENT_TYPES.register("radiation_source",
            () -> AttachmentType.<HashMap<BlockPos, List<RadiationEmission>>>builder(() -> new HashMap<BlockPos, List<RadiationEmission>>())
                    .serialize(new IAttachmentSerializer<CompoundTag, HashMap<BlockPos, List<RadiationEmission>>>() {
                @Override
                public HashMap<BlockPos, List<RadiationEmission>> read(IAttachmentHolder iAttachmentHolder, CompoundTag tag, HolderLookup.Provider provider) {
                    HashMap<BlockPos, List<RadiationEmission>> data = new HashMap<>();
                    int size = tag.getInt("sizeOfMap");


                    for (int i = 0; i < size; i++) {
                        CompoundTag blockEntryTag = tag.getCompound("" + i);

                        int finalI = i;
                        BlockPos blockPos = BlockPos.CODEC.parse(new Dynamic<>(NbtOps.INSTANCE, blockEntryTag.get("pos")))
                                .result()
                                .orElseThrow(() -> new IllegalStateException("Failed to parse BlockPos for entry " + finalI));

                        List<RadiationEmission> radiationEmissions = new ArrayList<>();
                        int emittersSize = blockEntryTag.getInt("sizeOfEmitters");

                        for (int j = 0; j < emittersSize; j++) {
                            CompoundTag emitterTag = blockEntryTag.getCompound("emitter" + j);

                            int finalJ = j;
                            RadiationEmission emitter = RadiationEmission.CODEC.parse(new Dynamic<>(NbtOps.INSTANCE, emitterTag))
                                    .result()
                                    .orElseThrow(() -> new IllegalStateException("Failed to parse RadiationEmitter at index " + finalJ));

                            radiationEmissions.add(emitter);
                        }

                        data.put(blockPos, radiationEmissions);
                    }

                    return data;
                }

                @Override
                public @Nullable CompoundTag write(HashMap<BlockPos, List<RadiationEmission>> blockPosListHashMap, HolderLookup.Provider provider) {
                    if (blockPosListHashMap == null || blockPosListHashMap.isEmpty()) {
                        return null;
                    }
                    CompoundTag data = new CompoundTag();

                    data.putInt("sizeOfMap", blockPosListHashMap.size());

                    int i = 0;
                    for (Map.Entry<BlockPos, List<RadiationEmission>> entry : blockPosListHashMap.entrySet()) {
                        CompoundTag blockEntryTag = new CompoundTag();

                        BlockPos.CODEC.encodeStart(NbtOps.INSTANCE, entry.getKey())
                                .resultOrPartial(error -> System.err.println("Failed to encode BlockPos: " + error))
                                .ifPresent(posTag -> blockEntryTag.put("pos", posTag));

                        List<RadiationEmission> emitters = entry.getValue();
                        blockEntryTag.putInt("sizeOfEmitters", emitters.size());

                        int j = 0;
                        for (RadiationEmission emitter : emitters) {
                            int finalJ = j;
                            RadiationEmission.CODEC.encodeStart(NbtOps.INSTANCE, emitter)
                                    .resultOrPartial(error -> System.err.println("Failed to encode RadiationEmitter: " + error))
                                    .ifPresent(emitterTag -> blockEntryTag.put("emitter" + finalJ, emitterTag));
                            j++;
                        }

                        data.put("" + i, blockEntryTag);
                        i++;
                    }

                    return data;
                }
            }).build());

    public static final DeferredHolder<AttachmentType<?>,AttachmentType<RadiationEmissionManager>> RADIATION_EMITTER_MANAGER = ATTACHMENT_TYPES.register("radiation_emitter_manager", () -> AttachmentType.<RadiationEmissionManager>builder(RadiationEmissionManager::new).build());

    public static final DeferredHolder<AttachmentType<?>,AttachmentType<List<RadiationReceiver>>> RADIATION_RECEIVERS = ATTACHMENT_TYPES.register("radiation_receivers", () -> AttachmentType.<List<RadiationReceiver>>builder(() -> new ArrayList<RadiationReceiver>()).serialize(new IAttachmentSerializer<CompoundTag, List<RadiationReceiver>>(){
        @Override
        public List<RadiationReceiver> read(IAttachmentHolder iAttachmentHolder, CompoundTag compoundTag, HolderLookup.Provider provider) {
            List<RadiationReceiver> radiationReceivers = new ArrayList<>();
            int size = compoundTag.getInt("sizeOfList");
            CompoundTag receivers = compoundTag.getCompound("receiverList");
            for (int i = 0; i < size; i++) {
                CompoundTag data = receivers.getCompound("receiver" + i);

                int finalI = i;
                RadiationReceiver currentReceiver = RadiationReceiver.CODEC.parse(new Dynamic<>(NbtOps.INSTANCE, data))
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Failed to parse RadiationReceiver at index " + finalI));
                radiationReceivers.add(currentReceiver);

            }
            return radiationReceivers;
        }

        @Override
        public @Nullable CompoundTag write(List<RadiationReceiver> radiationReceivers, HolderLookup.Provider provider) {
            CompoundTag data = new CompoundTag();
            data.putInt("sizeOfList", radiationReceivers.size());
            CompoundTag receivers = new CompoundTag();
            int i = 0;
            for (RadiationReceiver radiationReceiver : radiationReceivers) {
                int finalI = i;
                RadiationReceiver.CODEC.encodeStart(NbtOps.INSTANCE,radiationReceiver)
                        .resultOrPartial(error -> System.err.println("Failed to encode RadiationReceiver: " + error))
                        .ifPresent(receiverTag -> receivers.put("receiver" + finalI,receiverTag));

                        i++;
            }
            data.put("receiverList",receivers);
            return data;
        }
    }).build());

}
