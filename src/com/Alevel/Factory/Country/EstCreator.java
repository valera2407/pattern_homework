package com.Alevel.Factory.Country;

import com.Alevel.Factory.CreatorAbstract;
import com.Alevel.Factory.IceCreamInt;
import com.Alevel.Factory.Tasty.ChocolateIceCream;

public class EstCreator extends CreatorAbstract {
    @Override
    public IceCreamInt factoryCreator() {
        return new ChocolateIceCream();
    }
}
