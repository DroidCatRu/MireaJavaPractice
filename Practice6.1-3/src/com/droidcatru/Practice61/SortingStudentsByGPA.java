package com.droidcatru.Practice61;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student x, Student y) {
        return (x.getGpa() < y.getGpa()) ? -1 : ((x.getGpa() == y.getGpa()) ? 0 : 1);
    }
}
