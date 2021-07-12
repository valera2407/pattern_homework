package com.Alevel.Factory;

public class EstCreator extends CreatorAbstract {
    @Override
    public IceCreamInt factoryCreator() {
        return new ChocolateIceCream();
    }
}
