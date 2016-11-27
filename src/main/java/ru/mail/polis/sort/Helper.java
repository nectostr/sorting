package ru.mail.polis.sort;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {

    private static final Random r = ThreadLocalRandom.current();

    public static void swap(int[] a, int i, int j) {
        int x = a[i];
        a[i] = a[j];
        a[j] = x;
    }

    public static int[] gen(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = a.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            Helper.swap(a, i, j);
        }
        return a;
    }
    public static int[] genSortedRight(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }
    public static int[] genSortedBack(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = n-i;
        }
        return a;
    }
}
