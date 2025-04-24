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
        SortingTechniques.bubblesort(bubbleSortedNumbers);
        System.out.print("bubblesort: ");
        SortingTechniques.printArray(bubbleSortedNumbers);
        

        int[] quickSortedNumbers = numbers.clone();
        SortingTechniques.quickSort(quickSortedNumbers, 0, quickSortedNumbers.length - 1);
        System.out.print("quickSort: ");
        SortingTechniques.printArray(quickSortedNumbers);
        

        int[] selectionSortedNumbers = numbers.clone();
        SortingTechniques.selectionSort(selectionSortedNumbers);
        System.out.print("selectionSort: ");
        SortingTechniques.printArray(selectionSortedNumbers);
        

        int[] insertionSortedNumbers = numbers.clone();
        SortingTechniques.insertionSort(insertionSortedNumbers);
        System.out.print("insertionSort: ");
        SortingTechniques.printArray(insertionSortedNumbers);
        
        int[] mergeSortedNumbers = numbers.clone();
        SortingTechniques.mergeSort(mergeSortedNumbers);
        System.out.print("mergeSort: ");
        SortingTechniques.printArray(mergeSortedNumbers);
        
        int[] heapSortedNumbers = numbers.clone();
        SortingTechniques.heapSort(heapSortedNumbers);
        System.out.print("heapSort: ");
        SortingTechniques.printArray(heapSortedNumbers);
    
    
      System.out.println("\nPerformance Test:");

        int[] sizes = {100, 1000, 5000, 10000};

        for (int sizeTest : sizes) {
            int[] testArray = new int[sizeTest];
            for (int i = 0; i < sizeTest; i++) {
                testArray[i] = (int) (Math.random() * sizeTest);
            }

            int[] bubbleTest = testArray.clone();
            long start = System.nanoTime();
            SortingTechniques.bubblesort(bubbleTest);
            long end = System.nanoTime();
            System.out.println("Bubble Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] quickTest = testArray.clone();
            start = System.nanoTime();
            SortingTechniques.quickSort(quickTest, 0, quickTest.length - 1);
            end = System.nanoTime();
            System.out.println("Quick Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] selectionTest = testArray.clone();
            start = System.nanoTime();
            SortingTechniques.selectionSort(selectionTest);
            end = System.nanoTime();
            System.out.println("Selection Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] insertionTest = testArray.clone();
            start = System.nanoTime();
            SortingTechniques.insertionSort(insertionTest);
            end = System.nanoTime();
            System.out.println("Insertion Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] mergeTest = testArray.clone();
            start = System.nanoTime();
            SortingTechniques.mergeSort(mergeTest);
            end = System.nanoTime();
            System.out.println("Merge Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int[] heapTest = testArray.clone();
            start = System.nanoTime();
            SortingTechniques.heapSort(heapTest);
            end = System.nanoTime();
            System.out.println("Heap Sort (" + sizeTest + " elements): " + (end - start) + " ns");

            int [ ] shell = numbers. clone () ;
            SortingTechniques.shellSort (shell) ;
            System.out.print ("shellSort: "); 
            SortingTechniques.printArray (shell) ;
            
            
        }
      }
      
}   
   