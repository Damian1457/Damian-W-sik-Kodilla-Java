package com.kodilla.stream.repeat.strem;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectoryNew {

    private final List<BookNew> theBookList = new ArrayList<>();

    public BookDirectoryNew() {
        theBookList.add(new BookNew("Dylan Murphy", "Wolf of the mountains",2003, "001"));
        theBookList.add(new BookNew("Phoebe Pearson", "Slaves of dreams",2012, "002"));
        theBookList.add(new BookNew("Morgan Walsh", "Obliteration of heaven", 2001, "003"));
        theBookList.add(new BookNew("Aimee Murphy", "Rejecting the night", 2015, "004"));
        theBookList.add(new BookNew("Ryan Talley", "Gangsters and kings", 2007, "005"));
        theBookList.add(new BookNew("Madelynn Carson", "Unity without duty", 2007,"006"));
        theBookList.add(new BookNew("Giancarlo Guerrero", "Enemies of eternity", 2009, "007"));
    }
    public List<BookNew> getList() {
        return new ArrayList<>(theBookList);
    }

}
