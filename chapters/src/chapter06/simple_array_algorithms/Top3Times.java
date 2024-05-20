package chapter06.simple_array_algorithms;

public class Top3Times {
    
    public static void main(String[] args) {
        // Sample array of times
        int[] TIMES = {10, 15, 12, 11, 9, 13, 14, 8, 16};

        // Array to store the top 3 fastest times
        int[] TOP3 = {50, 50, 50};

        // Assign the first element of TIMES to TOP3[0]
        TOP3[0] = TIMES[0];

        // Loop through each index of TOP3[]
        for (int TOP_N = 0; TOP_N < 3; TOP_N++) {
            // Loop through each element of TIMES[]
            for (int TIME_N = 0; TIME_N < 9; TIME_N++) {
                // Compare the current time in TIMES[] with the current top time in TOP3[]
                if (TIMES[TIME_N] < TOP3[TOP_N]) {
                    // If the current time is faster, shift elements in TOP3[] and assign the new time
                    if (TOP_N == 0) {
                        TOP3[0] = TIMES[TIME_N];
                    } else if (TIMES[TIME_N] > TOP3[TOP_N - 1]) {
                        TOP3[TOP_N] = TIMES[TIME_N];
                    }
                }
            }
        }

        // Display the top 3 fastest times
        System.out.println("Top 3 fastest times:");
        for (int i = 0; i < 3; i++) {
            System.out.println(TOP3[i]);
        }
    }
}
