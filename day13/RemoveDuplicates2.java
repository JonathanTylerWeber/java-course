package day13;

import java.util.Arrays;

public class RemoveDuplicates2 {
  public static int[] removeDuplicates(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return arr;
    }

    Arrays.sort(arr);
    
    int[] temp = new int[arr.length];
    int j = 0;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != arr[i + 1]){
        temp[j++] = arr[i];
      }
    }

    temp[j++] = arr[arr.length - 1];

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
