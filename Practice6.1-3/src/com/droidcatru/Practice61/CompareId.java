package com.droidcatru.Practice61;

import java.util.Comparator;

public class CompareId implements Comparator<Student> {

    @Override
    public int compare(Student x, Student y) {
        return (x.getId() < y.getId()) ? -1 : ((x.getId() == y.getId()) ? 0 : 1);
    }
}
