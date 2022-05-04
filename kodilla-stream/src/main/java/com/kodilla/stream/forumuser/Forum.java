package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<ForumUser>();

    public Forum() {
        forumUserList.add(new ForumUser("23234423", "Jan", 'M', 1988, 07,
                21, 1));
        forumUserList.add(new ForumUser("232234423", "Maciej", 'M', 2000, 4,
                3, 9));
        forumUserList.add(new ForumUser("254634423", "Halinka", 'K', 2008, 4,
                3, 8));
        forumUserList.add(new ForumUser("256734423", "Bożenka", 'K', 2003, 4,
                3, 8));
        forumUserList.add(new ForumUser("2562456423", "Krzysiek", 'M', 1994, 4,
                3, 0));
        forumUserList.add(new ForumUser("2888756423", "Magda", 'K', 1999, 4,
                3, 4));

    }


    public List<ForumUser> getForumUserList (){
        return new ArrayList<>(forumUserList);
    }


}