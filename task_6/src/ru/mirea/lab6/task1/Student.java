package ru.mirea.lab6.task1;

public class Student implements Comparable<Student> {
    int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(iDNumber, s.iDNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(iDNumber);
    }
}