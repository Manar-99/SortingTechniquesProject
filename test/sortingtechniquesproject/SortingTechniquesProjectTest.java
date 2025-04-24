package sortingtechniquesproject;

import org.junit.Test;
import static org.junit.Assert.*;


public class SortingTechniquesProjectTest {

    // ----------------- Bubble Sort -----------------

    @Test
    public void testBubbleSort_sortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.bubblesort(input));
    }

    @Test
    public void testBubbleSort_unsortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.bubblesort(input));
    }

    @Test
    public void testBubbleSort_withDuplicates() {
        int[] input = {3, 2, 3, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        assertArrayEquals(expected, SortingTechniques.bubblesort(input));
    }

    @Test
    public void testBubbleSort_singleElement() {
        int[] input = {7};
        int[] expected = {7};
        assertArrayEquals(expected, SortingTechniques.bubblesort(input));
    }


    @Test
    public void testBubbleSort_twoElements() {
        int[] input = {9, 1};
        int[] expected = {1, 9};
        assertArrayEquals(expected, SortingTechniques.bubblesort(input));
    }

    // ----------------- Selection Sort -----------------

    @Test
    public void testSelectionSort_sortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.selectionSort(input));
    }

    @Test
    public void testSelectionSort_unsortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.selectionSort(input));
    }

    @Test
    public void testSelectionSort_withDuplicates() {
        int[] input = {3, 2, 3, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        assertArrayEquals(expected, SortingTechniques.selectionSort(input));
    }

    @Test
    public void testSelectionSort_singleElement() {
        int[] input = {7};
        int[] expected = {7};
        assertArrayEquals(expected, SortingTechniques.selectionSort(input));
    }


    @Test
    public void testSelectionSort_twoElements() {
        int[] input = {9, 1};
        int[] expected = {1, 9};
        assertArrayEquals(expected, SortingTechniques.selectionSort(input));
    }

    // ----------------- Insertion Sort -----------------

    @Test
    public void testInsertionSort_sortedArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        SortingTechniques.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_unsortedArray() {
        int[] input = {4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4};
        SortingTechniques.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_withDuplicates() {
        int[] input = {2, 1, 2, 3};
        int[] expected = {1, 2, 2, 3};
        SortingTechniques.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSort_singleElement() {
        int[] input = {10};
        int[] expected = {10};
        SortingTechniques.insertionSort(input);
        assertArrayEquals(expected, input);
    }


    @Test
    public void testInsertionSort_twoElements() {
        int[] input = {20, 5};
        int[] expected = {5, 20};
        SortingTechniques.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    // ----------------- Merge Sort -----------------

    @Test
    public void testMergeSort_sortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.mergeSort(input));
    }

    @Test
    public void testMergeSort_unsortedArray() {
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.mergeSort(input));
    }

    @Test
    public void testMergeSort_withDuplicates() {
        int[] input = {3, 2, 3, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        assertArrayEquals(expected, SortingTechniques.mergeSort(input));
    }

    @Test
    public void testMergeSort_singleElement() {
        int[] input = {42};
        int[] expected = {42};
        assertArrayEquals(expected, SortingTechniques.mergeSort(input));
    }


    @Test
    public void testMergeSort_twoElements() {
        int[] input = {9, 1};
        int[] expected = {1, 9};
        assertArrayEquals(expected, SortingTechniques.mergeSort(input));
    }

    // ----------------- Quick Sort -----------------

    @Test
    public void testQuickSort_sortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        SortingTechniques.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_unsortedArray() {
        int[] input = {6, 4, 2, 8, 1};
        int[] expected = {1, 2, 4, 6, 8};
        SortingTechniques.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_withDuplicates() {
        int[] input = {3, 2, 3, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        SortingTechniques.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort_singleElement() {
        int[] input = {99};
        int[] expected = {99};
        SortingTechniques.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }


    @Test
    public void testQuickSort_twoElements() {
        int[] input = {4, 2};
        int[] expected = {2, 4};
        SortingTechniques.quickSort(input, 0, input.length - 1);
        assertArrayEquals(expected, input);
    }
    // ----------------- Heap Sort -----------------

@Test
public void testHeapSort_sortedArray() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    SortingTechniques.heapSort(input);
    assertArrayEquals(expected, input);
}

@Test
public void testHeapSort_unsortedArray() {
    int[] input = {5, 4, 3, 2, 1};
    int[] expected = {1, 2, 3, 4, 5};
    SortingTechniques.heapSort(input);
    assertArrayEquals(expected, input);
}

@Test
public void testHeapSort_withDuplicates() {
    int[] input = {3, 2, 3, 1, 2};
    int[] expected = {1, 2, 2, 3, 3};
    SortingTechniques.heapSort(input);
    assertArrayEquals(expected, input);
}

@Test
public void testHeapSort_singleElement() {
    int[] input = {7};
    int[] expected = {7};
    SortingTechniques.heapSort(input);
    assertArrayEquals(expected, input);
}

@Test
public void testHeapSort_twoElements() {
    int[] input = {9, 1};
    int[] expected = {1, 9};
    SortingTechniques.heapSort(input);
    assertArrayEquals(expected, input);
}

// ----------------- Shell Sort -----------------

    @Test
    public void testShellSort_sortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.shellSort(input));
    }

    @Test
    public void testShellSort_unsortedArray() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, SortingTechniques.shellSort(input));
    }

    @Test
    public void testShellSort_withDuplicates() {
        int[] input = {3, 2, 3, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        assertArrayEquals(expected, SortingTechniques.shellSort(input));
    }

    @Test
    public void testShellSort_singleElement() {
        int[] input = {7};
        int[] expected = {7};
        assertArrayEquals(expected, SortingTechniques.shellSort(input));
    }


    @Test
    public void testShellSort_twoElements() {
        int[] input = {9, 1};
        int[] expected = {1, 9};
        assertArrayEquals(expected, SortingTechniques.shellSort(input));
    }
}

    

