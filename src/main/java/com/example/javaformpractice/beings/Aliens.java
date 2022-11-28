package com.example.javaformpractice.beings;

public class Aliens implements Being{
    private int eatingLimit;

    public void setEatingLimit(int eatingLimit){
        this.eatingLimit = eatingLimit;
    }

    public int getEatingLimit() {
        return eatingLimit;
    }
}
