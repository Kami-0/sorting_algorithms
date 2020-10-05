package ru.kami.sort.shaker;

import ru.kami.sort.api.SortApi;

import java.util.Arrays;

public class ShakerSort implements SortApi {
    public int[] sort(int[] array) {
        int rightBorder = array.length - 1;
        for (int leftBorder = 0; leftBorder < array.length / 2; leftBorder++) {
            moveMaxElementToEnd(array, rightBorder, leftBorder);
            moveMinElementToStart(array, rightBorder, leftBorder);
            rightBorder--;
        }
        return array;
    }

    private void moveMinElementToStart(int[] array, int rightBorder, int leftBorder) {
        for (int it = rightBorder; it > leftBorder; it--) {
            if (array[it] < array[it - 1]) {
                swap(array, it, it - 1);
            }
        }
    }

    private void moveMaxElementToEnd(int[] array, int rightBorder, int leftBorder) {
        for (int it = leftBorder; it < rightBorder - 1; it++) {
            if (array[it] > array[it + 1]) {
                swap(array, it, it + 1);
            }
        }
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
