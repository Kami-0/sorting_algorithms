package ru.kami.sort.bubble;

import ru.kami.sort.api.SortApi;

public class BubbleSort implements SortApi {

    public int[] sort(int[] array) {
        int rightBorder = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            for (int it = 0; it < rightBorder; it++) {
                if (array[it] > array[it + 1]) {
                    swap(array, it, it + 1);
                }
            }
            rightBorder--;
        }
        return array;
    }

    private void swap(int[] array, int firstElement, int secondElement) {
        int tmp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = tmp;
    }
}
