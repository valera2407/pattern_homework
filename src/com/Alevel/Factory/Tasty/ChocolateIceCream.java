package com.Alevel.Factory.Tasty;

import com.Alevel.Factory.IceCreamInt;

public class ChocolateIceCream implements IceCreamInt {
    @Override
    public void eat() {
        System.out.println("You eat chocolate icecream!");
    }
}
