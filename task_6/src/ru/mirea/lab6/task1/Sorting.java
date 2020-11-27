package ru.mirea.lab6.task1;
import java.lang.Comparable;
import java.util.Arrays;

public class Sorting {

    public Sorting() { }
    public void insertion_sort(Comparable[] list) {
        for (int left = 0; left < list.length; left++) {
            for (int i = 1; i < list.length; i++) {
                Comparable key = list[i];
                int j = i - 1;
                while (j >= 0 && list[j] > key) {
                    list[j + 1] = list[j];
                    j = j - 1;
                }
                list[j + 1] = key;
            }
        }
    }
}