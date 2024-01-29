package chapter06.simple_array_algorithms;

public class ArraySelectionSort {

    public static void main(String[] args) {
        
        // declaring and assigning values to an array
        // my unsorted numbers
        int[] myNumbers = { 64, 25, 12, 22, 11 };

        int n = myNumbers.length;

        // find the bug in this section
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (myNumbers[j] < myNumbers[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the found minimum element with the element at index i
            int temp = myNumbers[minIndex];
            myNumbers[minIndex] = myNumbers[i];
            myNumbers[i] = temp;
        }

        // print out sorted array
        for (int value : myNumbers) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}
