package com.velkent.potatiumcraft.init;

import com.velkent.potatiumcraft.item.ItemPC;
import com.velkent.potatiumcraft.item.ItemPotatiumDust;
import com.velkent.potatiumcraft.item.ItemPotatiumIngot;
import com.velkent.potatiumcraft.item.ItemPotatium;
import com.velkent.potatiumcraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemPC potatiumdust = new ItemPotatiumDust();
    public static final ItemPC potatiumingot = new ItemPotatiumIngot();
    public static final ItemPC potatium = new ItemPotatium();

    public static void init()
    {
        GameRegistry.registerItem(potatiumdust, "PotatiumDust");
        GameRegistry.registerItem(potatiumingot, "PotatiumIngot");
        GameRegistry.registerItem(potatium, "Potatium");
    }
}
