package week1.day2;

public class FindIntersection {
    public static void main(String[] args) {
        int[] array1 = {3, 2, 11, 4, 6, 7};
        int[] array2 = {1, 2, 8, 4, 9, 7};

        System.out.println("Intersection of the two arrays:");

        // Iterate over each element in array1
        for (int i = 0; i < array1.length; i++) {
            // Iterate over each element in array2
            for (int j = 0; j < array2.length; j++) {
                // Compare elements of array1 with elements of array2
                if (array1[i] == array2[j]) {
                    // If a match is found, print the matching element
                    System.out.println(array1[i]);
                    break; // Exit the inner loop after finding a match
                }
            }
        }
    }
}