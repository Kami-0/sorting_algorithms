package ru.kami.sort.bubble;

import ru.kami.sort.api.SortApi;

public class BubbleSort implements SortApi {

    public int[] sort(int[] array) {
        int size = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            for (int it = 0; it < size; it++) {
                if (array[it] > array[it + 1]) {
                    swap(array, it, it + 1);
                }
            }
            size--;
        }
        return array;
    }

    private void swap(int[] array, int firstElement, int twiceElement) {
        int tmp = array[firstElement];
        array[firstElement] = array[twiceElement];
        array[twiceElement] = tmp;
    }
}
