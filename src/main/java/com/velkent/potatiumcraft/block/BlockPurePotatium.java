package com.velkent.potatiumcraft.block;

public class BlockPurePotatium extends BlockPC
{
    public BlockPurePotatium() {
        super();
        this.setBlockName("purePotatium");
        this.setHardness(30.0F);
        this.setResistance(3000.0F);
        this.setLightLevel(15.0F);
        this.setStepSound(soundTypeMetal);
    }
}