package com.Alevel.Factory;

public class UaCreator extends CreatorAbstract {
    @Override
    public IceCreamInt factoryCreator() {
        return new VanillaIceCream();
    }
}
