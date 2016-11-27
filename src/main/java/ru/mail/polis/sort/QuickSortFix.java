package ru.mail.polis.sort;

import java.util.Random;

public class QuickSortFix {
    public static int[] sort(int[] a){
        quicksort(a, 0, a.length-1);
        return a;
    }
    public static Random rnd = new Random();
    static private void quicksort(int[] numbers, int low, int high) {
        int i = low, j = high;
        long pivot = numbers[(low+high)/2];
        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(numbers, low, j);
        if (i < high)
            quicksort(numbers, i, high);
    }
}


