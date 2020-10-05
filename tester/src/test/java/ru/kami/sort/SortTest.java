package ru.kami.sort;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.kami.sort.bubble.BubbleSort;
import ru.kami.sort.shaker.ShakerSort;

import java.util.Arrays;

public class SortTest {
    private final int[] unsortedArray = new int[]{2, 0, -1, 99, -1, -213, 2, 2, 1};
    private final int[] sortedArray = new int[]{-213, -1, -1, 0, 1, 2, 2, 2, 99};

    @Test
    void bubbleSortTest() {
        final int[] bubbleSortArray = new BubbleSort().sort(unsortedArray);
        Assert.assertArrayEquals(bubbleSortArray, sortedArray);
    }

    @Test
    void shakerSortTest() {
        final int[] shakeSortArray = new ShakerSort().sort(unsortedArray);
        Assert.assertArrayEquals(shakeSortArray, sortedArray);
    }
}
