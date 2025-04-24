package sortingtechniquesproject;

import java.util.Scanner;

public class SortingTechniquesProject {


      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input array size: ");
        int size = scanner.nextInt();
        
        while (size <= 0) {
        System.out.print(" Enter array size again (must be greater than 0): ");
        size = scanner.nextInt();

        if (size <= 0) {
        System.out.println("Invalid input. Please enter a number greater than 0.");
    }
}
        
        int[] numbers = new int[size];        
        System.out.println("input array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Sorting Techniques:");
        

        int[] bubbleSortedNumbers = numbers.clone();
        bubblesort(bubbleSortedNumbers);
        System.out.print("bubblesort: ");
        printArray(bubbleSortedNumbers);
        

        int[] quickSortedNumbers = numbers.clone();
        quickSort(quickSortedNumbers, 0, quickSortedNumbers.length - 1);
        System.out.print("quickSort: ");
        printArray(quickSortedNumbers);
        

        int[] selectionSortedNumbers = numbers.clone();
        selectionSort(selectionSortedNumbers);
        System.out.print("selectionSort: ");
        printArray(selectionSortedNumbers);
        

        int[] insertionSortedNumbers = numbers.clone();
        insertionSort(insertionSortedNumbers);
        System.out.print("insertionSort: ");
        printArray(insertionSortedNumbers);
        
        int[] mergeSortedNumbers = numbers.clone();
        mergeSort(mergeSortedNumbers);
        System.out.print("mergeSort: ");
        printArray(mergeSortedNumbers);
        
        int[] heapSortedNumbers = numbers.clone();
        heapSort(heapSortedNumbers);
        System.out.print("heapSort: ");
        printArray(heapSortedNumbers);
    
    
      System.out.println("\nPerformance Test:");

        int[] sizes = {100, 1000, 5000, 10000};

        for (int sizeTest : sizes) {
            int[] testArray = new int[sizeTest];
            for (int i = 0; i < sizeTest; i++) {
                testArray[i] = (int) (Math.random() * sizeTest);
            }

            int[] bubbleTest = testArray.clone();
            long start = System.nanoTime();
            bubblesort(bubbleTest);
            long end = System.nanoTime();
            System.out.println("Bubble Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] quickTest = testArray.clone();
            start = System.nanoTime();
            quickSort(quickTest, 0, quickTest.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] selectionTest = testArray.clone();
            start = System.nanoTime();
            selectionSort(selectionTest);
            end = System.nanoTime();
            System.out.println("Selection Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] insertionTest = testArray.clone();
            start = System.nanoTime();
            insertionSort(insertionTest);
            end = System.nanoTime();
            System.out.println("Insertion Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] mergeTest = testArray.clone();
            start = System.nanoTime();
            mergeSort(mergeTest);
            end = System.nanoTime();
            System.out.println("Merge Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] heapTest = testArray.clone();
            start = System.nanoTime();
            heapSort(heapTest);
            end = System.nanoTime();
            System.out.println("Heap Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int [ ] shell = numbers. clone () ;
            shellSort (shell) ;
            System.out.print ("shellSort: "); 
            printArray (shell) ;
            
            
        }
      }
      
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    

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
 
    public static int[] quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
    return arr;
}

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
}


