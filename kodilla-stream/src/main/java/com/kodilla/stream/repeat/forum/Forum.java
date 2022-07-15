package com.kodilla.stream.repeat.forum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(111111, "Jan", 'M', LocalDate.of(1988, 7,21), 1));
        forumUserList.add(new ForumUser(232234423, "Maciej", 'M', LocalDate.of(2000, 4, 3), 9));
        forumUserList.add(new ForumUser(254634423, "Halinka", 'K', LocalDate.of(2008, 4,3), 8));
        forumUserList.add(new ForumUser(256734423, "Bożenka", 'K', LocalDate.of(2003, 4,3), 8));
        forumUserList.add(new ForumUser(256245642, "Krzysiek", 'M', LocalDate.of(2015, 4,3), 0));
        forumUserList.add(new ForumUser(288875642, "Magda", 'K', LocalDate.of(1999, 4,3), 4));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
