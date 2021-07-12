package com.Alevel.Builder;

public class BookDirector {
    private BooksBuilder example;

    public BookDirector (final BooksBuilder example){
        this.example = example;
    }
    public Books construct(){
        return example
                .setName("Can you eat it?")
                .setPages(520)
                .setGenre("Fantasy")
                .setTopic("Fishing")
                .build();
    }
}
