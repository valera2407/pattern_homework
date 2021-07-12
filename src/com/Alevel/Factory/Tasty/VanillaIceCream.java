package com.Alevel.Factory.Tasty;

import com.Alevel.Factory.IceCreamInt;

public class VanillaIceCream implements IceCreamInt {
    @Override
    public void eat() {
        System.out.println("You eat vanilla icecream!");
    }
}
