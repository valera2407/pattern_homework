package com.Alevel.Builder;

public class BuilderBooks implements BooksBuilder {

    private Books bookExample;
    public BuilderBooks(){
        bookExample = new Books();
    }

    @Override
    public Books build (){
        Books book = new Books();
        book.setName(bookExample.getName());
        book.setPages(bookExample.getPages());
        book.setGenre(bookExample.getGenre());
        book.setTopic(bookExample.getTopic());
        return book;
    }

    @Override
    public BooksBuilder setName(String name) {
        bookExample.setName(name);
        return this;
    }
    @Override
    public BooksBuilder setPages(final int pages){
        bookExample.setPages(pages);
        return this;
    }
    @Override
    public BooksBuilder setGenre(String genre) {
        bookExample.setGenre(genre);
        return this;
    }
    @Override
    public BooksBuilder setTopic(String topic) {
        bookExample.setTopic(topic);
        return this;
    }
}
