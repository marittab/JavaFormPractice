package com.example.javaformpractice;


public class BlackKnight implements Comparable<BlackKnight>{
    private String name;
    private byte arms = 2;
    private byte legs = 2;
    private byte head = 1;
    private boolean alive = true;

    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    private static int DEFAULT_KNIGHT_LIST_SIZE = 10;

    public static BlackKnight[] allKnights = new BlackKnight[DEFAULT_KNIGHT_LIST_SIZE];

    public String getName() {
        return name;
    }

    public byte getArms() {
        return arms;
    }

    public byte getHead() {
        return head;
    }

    public byte getLegs() {
        return legs;
    }
    public boolean isAlive(){
        return alive;
    }

    public void cutOfArm() {
        arms--;
    }

    public void cutOfLegs() {
        legs--;
    }

    public void cutOfHead() {
        head--;
    }

    @Override
    public String toString() {
        return "BlackKnight { " + "\n" +
                "name: " + name + "\n" +
                "arms: " + arms + "\n" +
                "legs: " + legs + "\n" +
                "head: " + head + "\n" +
                "alive: " + alive + "\n" +
                "}";
    }

    public void strike() {
        if (alive) {
            if (arms > 0) {
                cutOfArm();
            } else if (legs > 0) {
                cutOfLegs();
            } else {
                cutOfHead();
                alive = false;
                numOfAliveKnights--;
                numOfDeadKnights++;
            }
        } else {
            System.out.println("Stop! He's already dead");
        }

    }

    public BlackKnight(String name) {
        this.name = name;
    }

    //constructor overload
    public BlackKnight() {
        this.name = "Anonymous Knight";//knight2
    }

    public static boolean createKnight(String name) {
        BlackKnight knight = new BlackKnight(name);

        for (int i = 0; i < allKnights.length; i++) {
            if (allKnights[i] == null) {
                allKnights[i] = knight;
                BlackKnight.numOfAliveKnights++;
                return true;
            }
        }
        return false;
    }

    public static boolean createKnight() {
        BlackKnight knight = new BlackKnight();


        return insertKnightIntoArray(knight);
    }
    public static boolean insertKnightIntoArray(BlackKnight knight) {
        for (int i = 0; i < allKnights.length; i++) {
            if (allKnights[i] == null) {
                allKnights[i] = knight;
                BlackKnight.numOfAliveKnights++;
                return true;
            }
        }
        return false;
    }

    public static BlackKnight getLatestKnight() {
        for (int i = 0; i < allKnights.length; i++) {
            if (allKnights[i] == null) {
                return allKnights[i - 1];
            }
        }
        return allKnights[DEFAULT_KNIGHT_LIST_SIZE - 1];

    }
    //.equals method
    @Override
    public boolean equals(Object o){
        if(this==o) return true;//check for self
        if(o == null || getClass() != o.getClass()) return false;
        BlackKnight knight = (BlackKnight) o;

        return (arms == knight.getArms()) &&
                (legs == knight.getLegs()) &&
                (head == knight.getHead()) &&
                (alive == knight.isAlive()) &&
                (name.equals(knight.getName()));
    }

    @Override
    public int hashCode(){
        int result = 31 * (name.hashCode() +
                ((Byte) arms).hashCode()+
                ((Byte) legs).hashCode()+
                ((Byte) head).hashCode()+
                ((Boolean) alive).hashCode());

        return result;
    }
    @Override
    public int compareTo(BlackKnight knight){
        return this.name.charAt(0) - knight.getName().charAt(0);
    }
}

