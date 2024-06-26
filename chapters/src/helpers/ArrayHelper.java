package helpers;

import java.util.Date;
import java.util.Random;

/**
 * This helper class was created by the Year 12s of the year 2021/22 to help
 * people learn about arrays.
 */
public class ArrayHelper {
    /**
     * Fill an array with the same value.
     * E.g. { , , , } -1 ==> { -1, -1, -1, -1} 
     * @param arr
     * @param value
     * @return arr
     */
    public static int[] fill(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

    /**
     * Replace instances of find value with a replacement value starting at a fromIndex.
     * E.g. {3, 4, 5, 5, 2, 1} 5  9 ==> {1, 4, 5, 9, 2, 1}
     * @param arr
     * @param find
     * @param replace
     * @param fromIndex
     * @return arr
     */
    public static int[] replace(int[] arr, int find, int replace, int fromIndex) {
        for(int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == find) {
                arr[i] = replace;
            }
        }
        return arr;
    }
    
    /**
     * Insert a value at a particular index in an array
     * E.g. {5, 6, 7} 2 0 ==> {2, 6, 7}
     * @param arr
     * @param index
     * @return arr
     */
    public static int[] insertAt(int[] arr, int value, int index) throws IndexOutOfBoundsException {
        arr[index] = value;
        return arr;
    }
    
    /**
     * Daniil Cohort 2023
     * Test whether an array contains a specific value.
     * E.g. {1, 4, 6} 6 ==> true | 7 ==> false
     * @param arr
     * @param value
     * @return if value in arr ==> true else ==> false
     */
    public static boolean contains(int[] arr, int value) {
        boolean flag = false;
        int position = find(arr, value);
        if (position != -1) {
            flag = true;
        }
        return flag;
    }

    /**
     * Bill Cohort 2023
     * Calculate average value of array elements.
     * E.g. {1, 2, 3} ==> 3
     * @param arr
     * @return average
     */
    public static int average(int[] arr) {
        int average = sum(arr) / arr.length;
        return average;
    }

    /**
     * Bill Cohort 2023
     * Calculate the total sum of array elements.
     * E.g. {1, 2, 3} => 6
     * @param arr
     * @return sum
     */
    public static int sum(int[] arr) {
        int sum = 0;
        // Using special for loop by Java because I don't need to know the index
        for (int i : arr) {
           sum = sum + i;
        }
        return sum;
    }

    /**
     * Mike Cohort 2023
     * Find the target in the array
     * E.g. {1, 5, 6, 7} 7 ==> 3, 8 ==> -1
     * @param arr
     * @return found? target index | -1
     */
    public static int find(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                return index; // breaks loop
            }
        }
        return index;
    }

    /**
     * @author Finn Cohort 2023
     * Get the largest value in the array.
     * @param arr
     * @return max
     */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Finn Cohort 2023
     * Get the smallest value in the array.
     * @param arr
     * @return min
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)  {  
            if (arr[i] < min) {
                min = arr[i];
            }
        }  
        return min;
    }

    /**
     * Truncate an array at a cut off index.
     * E.g. {1, 2, 3, -1, -1, -1} 2 ==> {1, 2, 3}
     * @param arr
     * @param cutOffIndex
     * @return
     */
    public static int[] truncate(int[] arr, int cutOffIndex) {
        int size = cutOffIndex + 1;
        int[] truncated = new int[size];
        for(int i = 0; i < size; i++) {
            truncated[i] = arr[i];
        }
        return truncated;
    }

    /**
     * Anirudh Cohort 2023
     * Remove duplicate elements in an array.
     * E.g. {1, 3, 1, 7, 9} ==> {1, 3, 7, 9}
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int cutOffIndex = -1;
        int size =  arr.length;
        for(int i = 0; i < size; i++) {
            boolean flag = contains(temp, arr[i]);
            if(flag == false) {
                cutOffIndex++;
                temp[cutOffIndex] = arr[i];
            }
        }
        return truncate(temp, cutOffIndex);
    }

    /**
     * Year 12 Cohort 2023 (from a flowchart found on the internet)
     * https://www.c-programming-simple-steps.com/images/xbubble-sort.png.pagespeed.ic.sNif7psMZJ.webp 
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int iterations = 1;
        while (iterations < arr.length) {
            int j = 0;
            while (j <= (arr.length - 2)) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            iterations++;
        }
        return arr;
    }

    /**
     * Kailu Cohort 2024 (from pseudocode in notes)
     * @param arr
     * @return
     */
    public static double[] bubbleSort(double[] arr) {
        for(int pass = 0; pass < arr.length - 1; pass++) {
            for(int current = 0; current < arr.length - 1; current++) {
                if (arr[current] > arr[current + 1]) {
                    // swap
                    double temp = arr[current];
                    arr[current] = arr[current+1];
                    arr[current+1] = temp;
                }
            }
        }
        return arr;
    }

    public static String[] bubbleSort(String[] arr) {
        for(int pass = 0; pass < arr.length - 1; pass++) {
            for(int current = 0; current < arr.length - 1; current++) {
                if (arr[current].compareTo(arr[current + 1]) > 0) {
                    // swap
                    String temp = arr[current];
                    arr[current] = arr[current+1];
                    arr[current+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Year 12 Cohort 2024 (from video)
     * https://www.youtube.com/watch?v=g-PGLbMth_g 
     * @param arr
     * @return
     */
    public int[] selectionSort(int[] arr) {
        for (int current = 0; current < arr.length - 2; current ++) { // sorted part (red)
            // set the red pointer (my current min)
            int min = current;
            // the blue pointer performs a linear search
            for (int counter = (current + 1); counter < arr.length; counter ++) {
                if (arr[counter] < arr[min]) {
                    min = counter;
                }
            }
            // was the blue pointer mission successful?
            if (min != current) {
                // swap min and current positions in arr (same as the bubble sort)
                int temp = arr[current];
                arr[current] = arr[current+1];
                arr[current+1] = temp;
            }
        }
        return arr;
    }

    public static void printElements(int[] arr) {
        for(int e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void printElements(double[] arr) {
        for(double e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public static void printElements(String[] arr) {
        for(String e : arr) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public int binarySearch(int[] arr, int key) {
        
        // todo: check that the arr is in ascending order!
        // throw an exception (link to topic 4 thinking ahead)
        
        int start = 0;
        int end = arr.length;

        // code for the binary search
        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // return an impossible value (key not found)
    }

    public static int randomElement(int[] arr) {
        // Create an instance of the Random class, put in the time as a seed
        Random randomGenerator = new Random((new Date()).getTime());
        // Use the behaviour defined in the Random class to get a number between 0 and arr.length - 1
        // We trust this because Java programmers test their code and make sure it works.
        int randomIndex = randomGenerator.nextInt(arr.length - 1);
        // return the randomIndex
        return randomIndex;
    }
}
