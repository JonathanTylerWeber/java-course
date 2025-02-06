package day13;

import java.util.Arrays;

public class RemoveDuplicates {
  // Function to remove duplicates from an array
  public static int[] removeDuplicates(int[] array) {
    if (array == null || array.length <= 1) {
      return array;
    }

    Arrays.sort(array);

    int[] temp = new int[array.length];
    int j = 0;

    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] != array[i + 1]) {
        temp[j++] = array[i];
      }
    }

    temp[j++] = array[array.length - 1];

    int[] result = new int[j];
    for (int i = 0; i < j; i++) {
      result[i] = temp[i];
    }

    return result;
  }

  public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {4, 5, 9, 4, 2, 2, 8, 9, 1, 3, 6, 1};
 
        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);
 
        // Print the result
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
