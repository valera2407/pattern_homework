package com.Alevel;


import com.Alevel.Factory.*;


public class Main {

    public static void main(String[] args) {
        /*singleton*//*
        Singleton singleton = Singleton.getInstance("command");
        System.out.println(singleton);
        *//*buielder*//*
        BooksBuilder builder = new BuilderBooks();
        BookDirector director = new BookDirector(builder);
        System.out.println(director.construct());
        *//*factory*/
        CreatorAbstract [] creators = {
                new EstCreator(),
                new PolCreator(),
                new UaCreator()
        };
        for (CreatorAbstract creator : creators){
            IceCreamInt icecream = creator.factoryCreator();
            System.out.println(icecream);
        }
    }
}
