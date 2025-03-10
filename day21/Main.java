package day21;

import java.util.HashSet;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    // ArrayList<String> fruits = new ArrayList<>();
    // fruits.add("apple");
    // fruits.add("banana");
    // fruits.add("cherry");

    // System.out.println("first fruit is: " + fruits.getFirst());
    // System.out.println("first fruit is: " + fruits.get(0));

    // for(String fruit : fruits){
    //   System.out.println(fruit);
    // }



    // 
    // 


    // hashset no duplicates
    // HashSet<String> set = new HashSet<>();
    // set.add("apple");
    // set.add("banana");
    // set.add("cherry");
    // set.add("apple");
    // System.out.println("hashset after additions " + set);

    // boolean containsBanana = set.contains("banana");
    // System.out.println(containsBanana);
    // set.remove("banana");

    // int size = set.size();
    // System.out.println(size);

    // for (String element : set) {
    //   System.out.println(element);
    // }

    // set.clear();



    // 
    // 
        
    int[] nums = {1, 2, 1, 3, 4, 5};

    boolean result = containsNearbyDuplicates(nums, 2);
    System.out.println(result);
    

  }  

  public static boolean containsNearbyDuplicates(int[] nums, int k){
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      }
      set.add(nums[i]);

      if (set.size() > k) {
        set.remove(nums[i - k]);
      }
    }

    return false;
  }
}
