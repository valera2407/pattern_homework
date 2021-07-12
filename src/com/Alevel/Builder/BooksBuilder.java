package com.Alevel.Builder;

public interface BooksBuilder {
    Books build ();
    BooksBuilder setPages(final int pages);
    BooksBuilder setGenre(final String genre);
    BooksBuilder setTopic(final String topic);
    BooksBuilder setName(final String name);
}
