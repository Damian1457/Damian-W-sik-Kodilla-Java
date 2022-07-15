package com.kodilla.stream.repeat.forum;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(int id, String userName, char sex, LocalDate birthDate, int posts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
