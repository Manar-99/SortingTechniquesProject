package sortingtechniquesproject;

public class SortingTechniques {
    
    
    /**
 * Bubble Sort: compares adjacent elements and swaps them if out of order.
 * Simple but inefficient; best used on nearly-sorted or small datasets.
 */
    
    public static int[] bubblesort(int[] numbers) {
    boolean swapped = true;
    long startTime = System.nanoTime();
    for (int i = 0; i < numbers.length - 1 && swapped; i++) {
        swapped = false;
        for (int j = 0; j < numbers.length - i - 1; j++) {
            if (numbers[j + 1] < numbers[j]) {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
                swapped = true;
            }
        }
    }
    long endTime = System.nanoTime();
    System.out.println("Time taken for Bubble Sort: " + (endTime - startTime) + " nanoseconds");
    return numbers;
}

    
    
    /**
 * Selection Sort: selects the smallest element and swaps it to the front.
 * Time complexity is always O(n²); useful for learning, not large data.
 */
    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest_element_index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[smallest_element_index])
                    smallest_element_index = j;
            int smallestNumber = arr[smallest_element_index];
            arr[smallest_element_index] = arr[i];
            arr[i] = smallestNumber;
        }
        return arr ;
    }

    
    
    /**
 * Insertion Sort: builds the sorted list one item at a time from the input.
 * Efficient for small or mostly sorted data; O(n²) in worst case.
 */
    public static void insertionSort(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            int cur = data[k];
            int j = k;
            while (j > 0 && data[j - 1] > cur) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = cur;
        }
    }

    
    /**
 * Merge Sort: splits the array into halves, sorts them, then merges back.
 * Guarantees O(n log n) time; uses more memory due to recursion.
 */
    public static int[] mergeSort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
                return inputArray;
         int[]temp=new int[size]; 
        mergeSortHelper(inputArray, temp , 0, size-1);
        return inputArray; }
        
private static void mergeSortHelper(int[] array, int[] temp, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        mergeSortHelper(array, temp, left, mid);       
        mergeSortHelper(array, temp, mid + 1, right);  
        merge(array, temp, left, mid, right);          
    }
}

private static void merge(int[] array, int[] temp, int left, int mid, int right) {
    for (int i = left; i <= right; i++) {
        temp[i] = array[i]; 
    }

    int i = left, j = mid + 1, k = left;  

    while (i <= mid && j <= right) {
        if (temp[i] <= temp[j]) {
            array[k++] = temp[i++];  
        } else {
            array[k++] = temp[j++]; 
        }
    }

    while (i <= mid) {
        array[k++] = temp[i++];  
    }
}
 

/**
 * Quick Sort: uses divide-and-conquer by partitioning the array recursively.
 * Very fast on average; performance depends on pivot choice.
 */
    public static int[] quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
    return arr;
}

    
    /**
 * Partition: reorders elements so that those less than pivot come before it.
 * Used in Quick Sort to divide the array into subarrays around a pivot.
 */
private static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}

/**
 * Heap Sort: builds a max-heap, then extracts the largest element repeatedly.
 * Always O(n log n); useful for in-place and non-recursive sorting.
 */
public static void heapSort(int[] array) {
    int n = array.length;
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(array, n, i);

    for (int i = n - 1; i > 0; i--) {
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;
        heapify(array, i, 0);
    }
}

private static void heapify(int[] array, int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && array[left] > array[largest])
        largest = left;

    if (right < n && array[right] > array[largest])
        largest = right;

    if (largest != i) {
        int swap = array[i];
        array[i] = array[largest];
        array[largest] = swap;
        heapify(array, n, largest);
    }
}


/**
 * Shell Sort: improves insertion sort by comparing distant elements first.
 * Performance varies with gap sequence; faster than bubble/insertion.
 */
public static int[ ]shellSort(int[] array) {
    
    int n = array.length;

    for (int gap = n / 2; gap > 0; gap /= 2) {
        for (int i = gap; i < n; i++) {
            int temp = array[i];
            int j=i;

            while ( j >= gap && array[j - gap] > temp) {
                array[j] = array[j - gap];
                j -= gap;
            }

            array[j] = temp;
 }
        
}
          return array;
    
}

public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}




