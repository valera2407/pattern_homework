package com.Alevel.Factory;

public class PolCreator extends CreatorAbstract {
    @Override
    public IceCreamInt factoryCreator() {
        return new BananaIceCream();
    }
}
