package ru.mail.polis.sort;

import java.io.*;
import java.util.StringTokenizer;

public class InsertionSort {



    public static int[] sort(int[] arr) {
        int i, j, newValue;
        int n = arr.length;
        for (i = 1; i < n; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (i != j) {
                arr[j] = newValue;
            }
        }
        return arr;
    }


}

