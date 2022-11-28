package com.example.javaformpractice.Collections;
// implement a set using an array with any size and create method to add item into array
// make array act like a set

public class MyArray {

    public Integer[] myIntArray = new Integer[3];

    public MyArray(){
    }

    public void add(Integer num){
        boolean result = false;

        for (int i=0; i< myIntArray.length; i++){
            if (myIntArray[i] == num){
                result = true;
            }
        }
        if (!result){
            for(int j=0; j< myIntArray.length; j++){
                if(myIntArray[j]==null){
                    myIntArray[j]=num;
                    return;
                }
            }
        }
    }
    public void toDisplay(){
        for (int i=0; i< myIntArray.length; i++){
            System.out.println(myIntArray[i]);
        }
    }

    public static void main(String[] args) {
        MyArray whatIsIt = new MyArray();
        whatIsIt.add(3);
        whatIsIt.add(6);
        whatIsIt.add(8);
        whatIsIt.add(15);
        whatIsIt.toDisplay();
    }
}
