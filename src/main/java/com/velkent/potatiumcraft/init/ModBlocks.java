package com.velkent.potatiumcraft.init;

import com.velkent.potatiumcraft.block.BlockImpurePotatium;
import com.velkent.potatiumcraft.block.BlockPC;
import com.velkent.potatiumcraft.block.BlockPotatiumOre;
import com.velkent.potatiumcraft.block.BlockPurePotatium;
import com.velkent.potatiumcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    public static final BlockPC potatiumOre = new BlockPotatiumOre();
    public static final BlockPC impurePotatium = new BlockImpurePotatium();
    public static final BlockPC purePotatium = new BlockPurePotatium();


    public static void init()
    {
        GameRegistry.registerBlock(potatiumOre, "potatiumOre");
        GameRegistry.registerBlock(impurePotatium, "impurePotatium");
        GameRegistry.registerBlock(purePotatium, "purePotatium");
    }
}
