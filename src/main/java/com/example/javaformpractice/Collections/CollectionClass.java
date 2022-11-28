package com.example.javaformpractice.Collections;

import java.nio.channels.Pipe;
import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        HashSet<String> myString = new HashSet<>();
        myString.add("Marita");
        myString.add("John");
        myString.add("John");

        System.out.println("Hello");


        for (String name : myString) {
            System.out.println(name);
        }

        TreeSet<String> myString1 = new TreeSet<>();
        myString1.add("Dob");
        myString1.add("Jim");
        myString1.add("Jim");

        for (String name : myString1) {
            System.out.println(name);
        }

        Set<Integer> numberSet = new HashSet<>();
        System.out.println(numberSet.isEmpty());
        numberSet.add(13);
        numberSet.add(6);
        numberSet.add(55);
        numberSet.add(9);

//print all numbers
        numberSet.forEach((Integer num) -> System.out.println(num));

  /*
  // Print all numbers
  for (Integer number : numberSet) {
            System.out.println(number);
        }*/
        List<String> names = new ArrayList<>();
        names.add("Julia");
        names.add("Adrea");

        System.out.println(names.get(1));


        List<String> names5 = new LinkedList<>();
        names5.add(0, "George");
        names5.add(1, "Susan");

        System.out.println(names5.get(0));


        // O(1) ===> constant time
        // O(n) ===> linear time
        //{1,2,3,4,5,6,7,8,9}


        Queue<String> queue = new LinkedList<>();
        queue.offer("Mim");
        queue.offer("Jimnim");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        Deque deque = new LinkedList();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Marita");
        map.put(2, "Ralfs");
        map.put(1, "Eliza");

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        map.remove(2);

        System.out.println(map.get(2));

        map.containsKey(2);
        map.containsValue("Eliza");
        map.size();



    }

}
