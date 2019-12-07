package com.droidcatru.Practice61;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();

        for(long i = 0; i < 10; i++) {
            long id = ThreadLocalRandom.current().nextLong(1, 1000);
            double gpa = ThreadLocalRandom.current().nextDouble(1, 1000);
            studentsList.add(new Student(i + " student", id, gpa));
        }

        ArrayList<Student> standardSorted = new ArrayList<>(studentsList);
        standardSorted.sort(new CompareId());

        System.out.println("Standard sort by id: ");
        for(Student student : standardSorted) {
            System.out.println(student);
        }

        ArrayList<Student> insertionSorted = new ArrayList<>(insertSort(studentsList, new CompareId()));

        System.out.println("Insertion sort by id: ");
        for(Student student : insertionSorted) {
            System.out.println(student);
        }

        ArrayList<Student> quickSortedReversed = new ArrayList<>(quickSortReversed(studentsList, 0, studentsList.size()-1, new SortingStudentsByGPA()));

        System.out.println("Quick sort by gpa reversed: ");
        for(Student student : quickSortedReversed) {
            System.out.println(student);
        }

        ArrayList<Student> mergeSorted = new ArrayList<>(mergeSort(studentsList,studentsList.size()-1, new CompareId()));

        System.out.println("Merge sort by id: ");
        for(Student student : mergeSorted) {
            System.out.println(student);
        }

    }

    private static ArrayList<Student> insertSort(ArrayList<Student> students, CompareId comparator) {
        for(int i = 1; i < students.size(); i++) {
            Student key = students.get(i);
            int j = i-1;

            while(j >= 0 && comparator.compare(students.get(j), key) > 0) {
                students.set(j+1, students.get(j));
                j--;
            }

            students.set(j+1, key);
        }

        return students;
    }

    private static ArrayList<Student> quickSortReversed(ArrayList<Student> students, int left, int right, SortingStudentsByGPA comparator) {
        int i = left;
        int j = right;

        if (j > i) {
            Student pivot = students.get((i + j) / 2);
            while (i <= j) {

                while(i < right && comparator.compare(students.get(i), pivot) > 0){
                    i++;
                }
                while(j > left && comparator.compare(students.get(j), pivot) < 0){
                    j--;
                }
                if (i <= j){
                    Student tmp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, tmp);
                    i++;
                    j--;
                }
            }
            if (left < j){
                students = new ArrayList<>(quickSortReversed(students, left, j, comparator));

            }
            if (right > i){
                students = new ArrayList<>(quickSortReversed(students, i, right, comparator));
            }
        }
        return students;
    }

    private static ArrayList<Student> mergeSort(ArrayList<Student> in, int right, CompareId comparator) {
        if(right >= 2) {
            int mid = right / 2;

            ArrayList<Student> l = new ArrayList<>();
            for(int i = 0; i < mid; i++) {
                l.add(in.get(i));
            }

            ArrayList<Student> r = new ArrayList<>();
            for(int i = mid; i < right; i++) {
                r.add(in.get(i));
            }

            l = new ArrayList<>(mergeSort(l, mid, comparator));
            r = new ArrayList<>(mergeSort(r,right-mid, comparator));

            int i = 0, j = 0, k = 0;

            while (i < mid && j < right-mid) {
                if(comparator.compare(l.get(i), r.get(j)) <= 0) {
                    in.set(k++, l.get(i++));
                }
                else {
                    in.set(k++, r.get(j++));
                }
            }
            while (i < mid) {
                in.set(k++, l.get(i++));
            }
            while (j < right-mid) {
                in.set(k++, r.get(j++));
            }
        }
        return in;
    }
}
