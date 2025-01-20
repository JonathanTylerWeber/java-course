package day9;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    // int[] numbers;
    // numbers = new int [5];

    // int[] numbers2 = {1, 2, 3, 4, 5};

    // int firstNum = numbers2[0];

    // System.out.println(firstNum);

    // 
    // 
    // iterate through array
    // int[] numbers = {1, 2, 3, 4, 5};

    // for (int i = 0; i < numbers.length; i++) {
    //   numbers[i] *= 2;
    //   System.out.println(numbers[i]);
    // }


    // 
    // 
    // for each loop
    // int[] numbers = {1, 2, 3, 4, 5};

    // for (int number : numbers) {
    //   System.out.println(number);
    // }

    // String[] friends = { "Molly", "Fred", "Bob"};

    // for (String friend : friends){
    //   System.out.println("Hello " + friend);
    // }


    // 
    // 
    // sum, min, max of array
    // int[] numbers = {1, 12, 33, 45, 5, 7};
    // int sum = 0;
    // int max = numbers[0];
    // int min = numbers[0];

    // for (int number : numbers) {
    //   if(number > max){
    //     max = number;
    //   }
    //   if(number < min){
    //     min = number;
    //   }
    //   sum += number;
    // }

    // System.out.println("sum is " + sum);
    // System.out.println("max is " + max);
    // System.out.println("min is " + min);

    // 
    // 
    // rearrange array
    // int[] nums = {2,5,1,3,4,7};
    // int n = nums.length / 2;
    // int[] rearranged = new int [nums.length];

    // for (int i = 0; i < n; i++) {
    //   rearranged[2*i] = nums[i];
    //   rearranged[2*i+1] = nums[i+n];
    // }
    // System.out.println("rearranged array: ");
    // for (int i : rearranged) {
    //   System.out.print(i);
    // }

    // 
    // 
    // array to string and sort
    // int[] nums = {2,5,1,3,4,7,8};
    // String[] names = { "Molly", "Fred", "Bob"};
    // System.out.println(Arrays.toString(nums));
    // System.out.println(Arrays.toString(names));

    // Arrays.sort(nums);
    // Arrays.sort(names);
    // System.out.println(Arrays.toString(nums));
    // System.out.println(Arrays.toString(names));

    // 
    // 
    // array binary search
    // int[] nums = {2,5,1,3,4,7,3,8};
    // Arrays.sort(nums);
    // int index = Arrays.binarySearch(nums, 7);

    // System.out.println(index);


    // 
    // 
    // copy of
    // int[] nums = {2,5,1,3,4,7,3,8};
    // int[] backupOfNums = Arrays.copyOf(nums, nums.length);
    // int[] smallNums = Arrays.copyOf(nums, 4); //more than length adds 0s
    // Arrays.sort(nums);
    // System.out.println(Arrays.toString(nums));
    // int index = Arrays.binarySearch(nums, 7);

    // System.out.println("index of 7 is at " + index);
    // System.out.println("backup " +Arrays.toString(backupOfNums));
    // System.out.println("small nums " +Arrays.toString(smallNums));


    // 
    // 
    // fill and equal
    int[] nums = new int[5];
    // Arrays.fill(nums, 10); //fill all with 10s
    Arrays.fill(nums, 0, 3, 10);
    Arrays.fill(nums, 3, 5, 11);
    System.out.println(Arrays.toString(nums));

    int[] myNums= {10,10,10,11,11};
    System.out.println(Arrays.toString(myNums));
    System.out.println(Arrays.equals(nums,myNums));

  }
}
