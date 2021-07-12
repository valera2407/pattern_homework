package com.Alevel.Builder;

public class Books {
    private int pages;
    private String genre;
    private String topic;
    private String name;

    public Books(){

    }


    public void setPages(final int pages) {
        this.pages = pages;
    }
    public void setGenre(final String genre) {
        this.genre = genre;
    }
    public void setTopic(final String topic) {
        this.topic = topic;
    }
    public void setName(final String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }
    public String getGenre() {
        return genre;
    }
    public String getTopic() {
        return topic;
    }
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Book [name = " + name + ", pages = " + pages + ", genre = " + genre + ", topic = " + topic + "]";
    }
}
