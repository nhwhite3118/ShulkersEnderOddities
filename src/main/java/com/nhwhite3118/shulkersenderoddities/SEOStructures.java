package com.nhwhite3118.shulkersenderoddities;

import com.mojang.serialization.MapCodec;
import com.nhwhite3118.shulkersenderoddities.structures.EnderPuzzleCapsule;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SEOStructures {

    /**
     * We are using the Deferred Registry system to register our structure as this is the preferred way on NeoForge.
     * This will handle registering the base structure for us at the correct time so we don't have to handle it ourselves.
     */
    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(Registries.STRUCTURE_TYPE, ShulkersEnderOddities.MODID);

    /**
     * Registers the base structure itself and sets what its path is. In this case,
     * this base structure will have the resourcelocation of shulkersenderoddities:ender_puzzle_capsule.
     */
    public static final DeferredHolder<StructureType<?>, StructureType<EnderPuzzleCapsule>> ENDER_PUZZLE_CAPSULE = DEFERRED_REGISTRY_STRUCTURE.register("ender_puzzle_capsule", () -> explicitStructureTypeTyping(EnderPuzzleCapsule.CODEC));

    /** TelepathicGrunt:
     * Originally, I had a double lambda ()->()-> for the RegistryObject line above, but it turns out that
     * some IDEs cannot resolve the typing correctly. This method explicitly states what the return type
     * is so that the IDE can put it into the DeferredRegistry properly.
     */
    private static <T extends Structure> StructureType<T> explicitStructureTypeTyping(MapCodec<T> structureCodec) {
        return () -> structureCodec;
    }
}