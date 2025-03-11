package day22;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

import day17.This;

public class Main {
  public static void main(String[] args) {
    // java collections

    // ***********************
    // Queue interface 
    // FIFO ideal for task scheduling and breadth first search
    // first element added is first one removed
    // non blocking: operations are typically non blocking ensuring efficiency
    // no null values, most queue implementations do not allow null elements

    // key methods:
    // add: insert into queue, throws exception if queue full
    // offer: insetrs element, returns fals if queue is full
    // remove: removes and returns head of the queue, throws exception if empty
    // poll: removes and returns the or head or returns null if empty
    // element: retrieves the head without removing it, exception if empty
    // peek: retrieves head without removing, or returns null if empty

    // implementations of queue interface:
    // doubly linked list



    // 
    // 
    // priority queue 
    // (no predefined size)
    Queue<Integer> priorityQueue = new PriorityQueue<>();
    priorityQueue.add(30);
    priorityQueue.add(20);
    priorityQueue.add(10);
    priorityQueue.add(40);

    System.out.println("priority queue " + priorityQueue);
    // takes smallest item first, everything else is unstructured, get rid of 10 and 20 would be first
    // priority queue [10, 30, 20, 40]

    if(!priorityQueue.isEmpty()){
      int removedElement = priorityQueue.poll();
      System.out.println(removedElement);
      // 10

      System.out.println("priority queue " + priorityQueue);
      // priority queue [20, 30, 40]

      int head = priorityQueue.peek();
      System.out.println("head " + head);
      // head 20

      System.out.println("priority queue " + priorityQueue);
      // priority queue [20, 30, 40]

      while(!priorityQueue.isEmpty()){
        System.out.println(priorityQueue.poll());
        // 20
        // 30
        // 40
      }
    }


    // 
    // 
    // arrayDeque 
    // (can be used as queue and stack LIFO and FIFO) maintains order
    // has fixed capacity but can resize, efficient and versatile
    // cannot store null
    Deque<String> arrayDeque = new ArrayDeque<>();

    arrayDeque.addFirst("First");
    arrayDeque.addLast("Second");
    arrayDeque.addLast("Third");

    System.out.println("arrayDeque " + arrayDeque);
    // arrayDeque [First, Second, Third]

    String removedFirst = arrayDeque.removeFirst();
    System.out.println("removedFirst " + removedFirst);
    // removedFirst First

    String removedLast = arrayDeque.removeLast();
    System.out.println("removedLast " + removedLast);
    // removedLast Third

    String peekFirst = arrayDeque.peekFirst();
    System.out.println("peekFirst " + peekFirst);
    // peekFirst Second



    // ***********************
    // Map Interface
    // stores key value pairs, each key is unique but values can be duplicates
    // easy value lookup via keys
    // multiple implementations HashMap, TreeMap, LinkedHashMap
    // common methods: put, get, remove, containsKey, containsValue, size, clear


    // 
    // Hash map
    // widely used fast key value operations through hash table, doesnt maintain element order
    
    Map<String, String> capitals = new HashMap<>();
    capitals.put("USA", "Washington DC");
    capitals.put("Germany", "Berlin");
    capitals.put("France", "Paris");
    capitals.put("England", "London");

    System.out.println("Capital of Germany: " + capitals.get("Germany"));

    capitals.remove("France");

    capitals.replace("England", "Manchester");

    for (Map.Entry<String, String> entry : capitals.entrySet()) {
      System.out.println("Country: " 
        + entry.getKey() 
        + ", Capital: " 
        + entry.getValue());
    }



    // 
    // LinkedHashMap
    // maintains insertion or access order with a linked list ensuring predictable iteration but slightl slower than hashmap
    System.out.println("linked hash map");
    // basically the same but maintains order of insertion
    Map<String, String> capitals1 = new LinkedHashMap<>();
    capitals1.put("USA", "Washington DC");
    capitals1.put("Germany", "Berlin");
    capitals1.put("France", "Paris");
    capitals1.put("England", "London");

    // System.out.println("Capital of Germany: " + capitals1.get("Germany"));

    // capitals1.remove("France");

    capitals1.replace("England", "Manchester");

    for (Map.Entry<String, String> entry : capitals1.entrySet()) {
      System.out.println("Country: " 
        + entry.getKey() 
        + ", Capital: " 
        + entry.getValue());
    }




    // 
    // TreeMap
    // sorts entries by natural key order or a comparato, slower than above but essential for maintaining sorted order
    // TreeMap is an implementation of the Map interface that stores keys in a sorted order. It is based on a Red-Black tree data structure.

    // Structure: Uses a Red-Black tree to maintain sorted order of keys. This is an advanced data structure that is out of the scope of this course. Just used as knowledge reference.
    // Ordering: Keys are sorted according to their natural order or a custom comparator.
    // Performance: Offers logarithmic time complexity for get, put, and remove operations.
    // Use Case: When a sorted map is required.
    // Red-Black tree - A special type of tree data structure. It is a more advanced concept and is not used anywhere in this course. To learn more about it: https://www.javatpoint.com/red-black-tree-java
    // Example of TreeMap Usage:

    // import java.util.Map;
    // import java.util.TreeMap;
    
    // public class TreeMapExample {
    //     public static void main(String[] args) {
    //         // Create a TreeMap
    //         Map<String, Integer> inventory = new TreeMap<>();
    
    //         // Adding key-value pairs
    //         inventory.put("Apple", 50);
    //         inventory.put("Banana", 30);
    //         inventory.put("Orange", 20);
    
    //         // Iterating over the map (sorted by keys)
    //         for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
    //             System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
    //         }
    //     }
    // }




    // 
    // HashTable
    // synchronized thread safe map, slower than hashmap and outdated compared to concurrentHashMap, doesnt allow null keys/values
    // legacy Hashmap extension



    // 
    // Iterator Interface
    // enables sequential access to elemetns across various collections like arraylist, hashset, and linkedlist without exposing their structure
    // accesses element one at a time
    // read and remove safely
    // decoupling: separattes iteration logic 
    // methods: hasnext, next, remove

    

  }
}
