package ru.kami.sort.even_sort;

import ru.kami.sort.api.SortApi;

import java.util.Arrays;

public class EvenOddSort implements SortApi {
    public int[] sort(int[] array) {
        boolean evenFlag = false;
        boolean oddFlag = false;
        do {
            evenFlag = false;
            oddFlag = false;
            for (int i = 0; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    evenFlag = true;
                }
            }
            for (int i = 1; i < array.length - 1; i += 2) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    oddFlag = true;
                }
            }
        } while (evenFlag || oddFlag);
        return array;
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
