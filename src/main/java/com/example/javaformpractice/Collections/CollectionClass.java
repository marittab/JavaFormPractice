package com.example.javaformpractice.Collections;

import com.example.javaformpractice.BlackKnight;

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
        System.out.println("\nQClassWork");

        //create ,method to add a black knight into your queue
        // when knight is dead, the knight is removed from queue and next knight is used to play

      /*  Queue<BlackKnight> blackKnightQueue = new LinkedList<>();
        blackKnightQueue.add(new BlackKnight());
        System.out.println(blackKnightQueue.peek().toString());
        do {
            blackKnightQueue.peek().strike();
        } while (blackKnightQueue.peek().isAlive());
        System.out.println(blackKnightQueue.peek().toString());
        blackKnightQueue.poll();
        blackKnightQueue.peek().toString();*/


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Marita");
        map.put(2, "Ralfs");
        map.put(1, "Eliza");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        map.remove(2);

        System.out.println(map.get(2));

        map.containsKey(2);
        map.containsValue("Eliza");
        map.size();

        Integer one = 1; // lietojot int nestrādā
        Integer otherOne = 1;

        //is objects are equals
        System.out.println(one.hashCode() == otherOne.hashCode());
        System.out.println(one.equals(otherOne));

        BlackKnight knight1 = new BlackKnight("Sam");
        BlackKnight knight2 = new BlackKnight("Sam");

        System.out.println(knight1.equals(knight2));

        List<BlackKnight> knights = Arrays.asList(knight1, knight2);

        System.out.println(knights.contains(new BlackKnight("Sam")));

        System.out.println();

        Set<BlackKnight> knights2 = new HashSet<>();
        knights2.add(knight1);
        knights2.add(knight2);

        System.out.println(knights2.contains(new BlackKnight("Sam")));


        Map<BlackKnight, String> map2 = new HashMap<>();
        BlackKnight knight5 = new BlackKnight("John");
        BlackKnight knight6 = new BlackKnight("Joshua");
        BlackKnight knight7 = new BlackKnight("Susan");

        map2.put(knight5, knight5.getName());
        map2.put(knight6, knight6.getName());
        map2.put(knight7, knight7.getName());

        System.out.println(map2.containsKey(new BlackKnight("Susan")));

        Integer x = 3;
        System.out.println(x.compareTo(2));
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(6));

        System.out.println();
        Comparator<Integer> intComparator = Comparator.naturalOrder();
        System.out.println(intComparator.compare(3, 2));
        System.out.println(intComparator.compare(3, 3));
        System.out.println(intComparator.compare(3, 4));


        List<BlackKnight> knights3 = new ArrayList<>();
        BlackKnight knight9 = new BlackKnight("Ilze");
        BlackKnight knight8 = new BlackKnight("Ieva");

        knights3.add(knight9);
        knights3.add(knight8);


        Collections.sort(knights3);

        for (BlackKnight knight : knights3) {
            System.out.println(knight.getName());
        }

        Integer[] arr = new Integer[]{1, 3, 5, 7, 10};
        List<Integer> result = Arrays.asList(arr);

        System.out.println(result);

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};


        System.out.println(Arrays.compare(arr1, arr2));

        int[] copiedArray = Arrays.copyOf(arr1, arr1.length + 1);


        System.out.println(Arrays.toString(copiedArray));

        List<List> list = Collections.emptyList();
        Map<String, Integer> mapp = Collections.emptyMap();

        List<Integer> listt = Arrays.asList(new Integer[]{1, 45, 2, 44, 98});
        System.out.println(Collections.min(listt));
        System.out.println(Collections.min(listt, Collections.reverseOrder()));


    }
    }

            /*@Override
            public int compare(BlackKnight k1, BlackKnight k2) {
                return (int) k1.getName().charAt(0) - (int) k2.getName().charAt(0);*/






// COMPARATOR ===> compare(obj1, obj2)
// COMPARABLE ===> compareTo(obj)

/*
* A.compareTo(B)
* value > 0 { ..., B, A,...}
* value == 0 { ..., A, B,...}//equal
* value < 0 { ..., A,B,,...}
*
*
*Compare (A, B)
* Value > 0 { ...B,A...}
* value==0 {...A,B..}
* value<0 {...A,B...}
* */

/*
* (1, 10, 7, 3, 5) size n 0(N)
* (1, 3, 5, 7, 10)
* */


//write a compare method implementation to compare knights by name
//checking the next character if current characters are equal.
//should also not be case-sensitive

/*
* Create a class user which implements comparable
* FIELDS: firstname, lastname, age, height
* sort these objects by the fields in same order
 */

/*
*Users => name, balance
Sales => records per user

get all users sorted by  name
get all users sorted by  balance ASC
get all users sorted by most paying DESC*/