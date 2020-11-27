package ru.mirea.lab6.task1;

import ru.mirea.lab6.task1.Sorting;
import ru.mirea.lab6.task1.Student;

public class TestInsertion {
    public static void main(String[] args) {
        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};
        Sorting.insertion_sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}