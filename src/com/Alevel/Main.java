package com.Alevel;


import com.Alevel.Adapter.CableInternet;
import com.Alevel.Adapter.Internet;
import com.Alevel.Adapter.WiFiAdapter;
import com.Alevel.Builder.BookDirector;
import com.Alevel.Builder.BooksBuilder;
import com.Alevel.Builder.BuilderBooks;
import com.Alevel.Factory.*;
import com.Alevel.Factory.Country.EstCreator;
import com.Alevel.Factory.Country.PolCreator;
import com.Alevel.Factory.Country.UaCreator;


public class Main {

    public static void main(String[] args) {
        //singleton
        Singleton singleton = Singleton.getInstance("command");
        System.out.println(singleton);
        //
        System.out.println();
        //buielder
        BooksBuilder builder = new BuilderBooks();
        BookDirector director = new BookDirector(builder);
        System.out.println(director.construct());
        //
        System.out.println();
       // factory
        CreatorAbstract [] creators = {
                new EstCreator(),
                new PolCreator(),
                new UaCreator()
        };
        for (CreatorAbstract creator : creators){
            IceCreamInt icecream = creator.factoryCreator();
            icecream.eat();
        }
        //
        System.out.println();
        //adapter
        Internet wiFiAdapter = new WiFiAdapter(new CableInternet());
        wiFiAdapter.useInternet();
        System.out.println();
        wiFiAdapter.search();
    }
}
