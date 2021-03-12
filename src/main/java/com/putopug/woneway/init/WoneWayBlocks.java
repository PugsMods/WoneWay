package com.putopug.woneway.init;

import com.putopug.woneway.WoneWay;
import com.putopug.woneway.objects.blocks.SeeThroughBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

//
//@author PutoPug
//
public class WoneWayBlocks {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoneWay.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoneWay.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //BLOCKS
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_LEAVES = BLOCKS.register("seethrough_acacia_leaves", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_LOG = BLOCKS.register("seethrough_acacia_log", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_PLANKS = BLOCKS.register("seethrough_acacia_planks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ACACIA_BARK = BLOCKS.register("seethrough_acacia_bark", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ANCIENT_DEBRIS = BLOCKS.register("seethrough_ancient_debris", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_ANDESITE = BLOCKS.register("seethrough_andesite", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BASALT = BLOCKS.register("seethrough_basalt", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BEDROCK = BLOCKS.register("seethrough_bedrock", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BEE_NEST = BLOCKS.register("seethrough_bee_nest", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BEEHIVE = BLOCKS.register("seethrough_beehive", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_LEAVES = BLOCKS.register("seethrough_birch_leaves", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_LOG = BLOCKS.register("seethrough_birch_log", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_PLANKS = BLOCKS.register("seethrough_birch_planks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BIRCH_WOOD = BLOCKS.register("seethrough_birch_wood", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_CONCRETE = BLOCKS.register("seethrough_black_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_CONCRETE_POWDER = BLOCKS.register("seethrough_black_concrete_powder", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_GLAZED_TERRACOTTA = BLOCKS.register("seethrough_black_glazed_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_SHULKER_BOX = BLOCKS.register("seethrough_black_shulker_box", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_STAINED_GLASS = BLOCKS.register("seethrough_black_stained_glass", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_TERRACOTTA = BLOCKS.register("seethrough_black_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACK_WOOL = BLOCKS.register("seethrough_black_wool", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLACKSTONE = BLOCKS.register("seethrough_blackstone", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLAST_FURNACE = BLOCKS.register("seethrough_blast_furnace", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_CONCRETE = BLOCKS.register("seethrough_blue_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_CONCRETE_POWDER = BLOCKS.register("seethrough_blue_concrete_powder", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("seethrough_blue_glazed_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_ICE = BLOCKS.register("seethrough_blue_ice", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_SHULKER_BOX = BLOCKS.register("seethrough_blue_shulker_box", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_STAINED_GLASS = BLOCKS.register("seethrough_blue_stained_glass", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_TERRACOTTA = BLOCKS.register("seethrough_blue_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BLUE_WOOL = BLOCKS.register("seethrough_blue_wool", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BONE_BLOCK = BLOCKS.register("seethrough_bone_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BOOKSHELF= BLOCKS.register("seethrough_bookshelf", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BRAIN_CORAL_BLOCK = BLOCKS.register("seethrough_brain_coral_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BRICKS = BLOCKS.register("seethrough_bricks", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_CONCRETE = BLOCKS.register("seethrough_brown_concrete", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_CONCRETE_POWDER = BLOCKS.register("seethrough_brown_concrete_powder", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_GLAZED_TERRACOTTA = BLOCKS.register("seethrough_brown_glazed_terracotta", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BROWN_MUSHROOM_BLOCK = BLOCKS.register("seethrough_brown_mushroom_block", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);
    public static final RegistryObject<Block> SEETHROUGH_BARREL = BLOCKS.register("seethrough_barrel", SeeThroughBlock::new);




    //ITEMS
    public static final RegistryObject<Item> SEETHROUGH_BASALT_ITEM = ITEMS.register("seethrough_basalt", () -> new BlockItemBase(SEETHROUGH_BASALT.get()));
}
