package com.Alevel.Factory.Country;

import com.Alevel.Factory.CreatorAbstract;
import com.Alevel.Factory.IceCreamInt;
import com.Alevel.Factory.Tasty.BananaIceCream;

public class PolCreator extends CreatorAbstract {
    @Override
    public IceCreamInt factoryCreator() {
        return new BananaIceCream();
    }
}
