package com.example.javaformpractice.Collections;

import java.util.*;

public class Users implements Comparable<Users>{

    private String name;
    private double balance = 0;
    private double spend = 0;
    public Users(){
    }

    public static List<Users> user = new ArrayList<>();
    public Users(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.spend=0;
    }
    public Users(String name) {
        this.name = name;

    }

    public String toString2(){
        return "User {name: "+ name + " }";
    }

    public static <T> Box<T> createBoxObject(T t){
        Box<T> newBox = new Box <>();
        newBox.setItem(t);

        return newBox;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public double getSpend() {
        return spend;
    }
    public void buy(Products products){
        this.balance = this.balance-products.getPrice();
        this.spend = spend + products.getPrice();
    }

    @Override
    public String toString(){
        return "Name: " + this.name+" Balance: "+this.balance+ " Has spend: "+ this.spend+"\n";
    }
    @Override
    public int compareTo(Users users){
        int compare = 0;
        if(compare==0){
            compare=name.toLowerCase().compareTo(users.getName().toLowerCase());
        }
        if(compare==0){
            compare=Double.compare(balance, users.getBalance());
        }
        if(compare==0){
            compare=Double.compare(spend, users.getSpend());
        }
        return compare;
    }

    public static void main(String[] args) {
        //create users objects
        Users user1 = new Users("Linda", 200);
        Users user2 = new Users("Sandra", 890);
        Users user3 = new Users("Liene", 340);

        //add users to list
        List<Users> myUsers = new ArrayList<>();
        myUsers.add(user1);
        myUsers.add(user2);
        myUsers.add(user3);

        System.out.println("================ORIGINAL USER LIST----------");

        //Print out NEW USERS LIST
        System.out.println("Users list: " + myUsers.toString());

        //Create product list
        List<Products> myProducts = new ArrayList<>();
        myProducts.add(new Products("Meat", 5.5));
        myProducts.add(new Products("Cheese", 9.5));
        myProducts.add(new Products("Milk", 1.4));
        myProducts.add(new Products("Bread", 1.2));

        System.out.println("==============PRODUCT LIST=======");
        System.out.println("Product list: " + myProducts.toString());

        System.out.println("===========After Buying Something==========");

        //set users from myUsers list to buy some product from list using index

        myUsers.get(0).buy(myProducts.get(0));
        myUsers.get(0).buy(myProducts.get(1));

        myUsers.get(1).buy(myProducts.get(1));
        myUsers.get(1).buy(myProducts.get(2));

        //print out changes on users list after buying

        System.out.println(myUsers.toString());

       // System.out.println("User 1 sales "+ user1.getSpend());

        System.out.println("---------SORTING----------");

        //SORT USERS BY NAME
       // Collections.sort(myUsers);

        //SORT USERS BY BALANCE LOW-HIGH(ASC)
        Collections.sort(myUsers, Comparator.comparingDouble(Users::getBalance));

        //SORT MY MOST MONEY SPEND HIGH=MIN(DESC)
       /* Collections.reverseOrder(Comparator.comparingDouble(Users::getSpend));//alone this line only reverse names NOT SPENDING PARAMETERS
        Comparator<Users> reverseUserSpendList = Collections.reverseOrder(Comparator.comparingDouble(Users::getSpend));
        Collections.sort(myUsers, reverseUserSpendList);*/

        //PRINT OUT SORTED LIST
        for(Object u : myUsers){
            System.out.println(u.toString());
        }

        Box<Users> newBoxedUser = createBoxObject(new Users("Marita"));




    }
}
