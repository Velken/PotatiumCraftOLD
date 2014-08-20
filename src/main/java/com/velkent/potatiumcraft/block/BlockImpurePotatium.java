package com.velkent.potatiumcraft.block;

public class BlockImpurePotatium extends BlockPC
{
    public BlockImpurePotatium()
    {
        super();
        this.setBlockName("impurePotatium");
        this.setHardness(30.0F);
        this.setResistance(3000.0F);
        this.setLightLevel(0.1F);
        this.setStepSound(soundTypeMetal);
    }

}
