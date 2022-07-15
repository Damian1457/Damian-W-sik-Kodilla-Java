package com.kodilla.stream.repeat.strem;

public final class BookNew {

    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public BookNew(final String author, final String title, final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "BookNew{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }

    public String getSignature() {
        return signature;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }

}
