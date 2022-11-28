package com.example.javaformpractice.Collections;

import com.example.javaformpractice.BlackKnight;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private String name;
    private Type type;

public Car(String name, Type type){
    this.name = name;
    this.type = type;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//check for self
        if (o == null || getClass() != o.getClass()) return false;
        Car myCar = (Car) o;

        return (name.trim().toLowerCase().equals(myCar.name.trim().toLowerCase())) && (type.equals(myCar.type));
    }

    @Override
    public int hashCode() {
        int result = 31 * (name.trim().toLowerCase().hashCode() + type.hashCode());

        return result;
    }

    public static void main(String[] args) {
        Car car1 = new Car ("Volvo" , Type.AUTOMATIC);
        Car car2 = new Car ("VolVo " , Type.AUTOMATIC);

        System.out.println(car1.equals(car2));

        System.out.println();
        Set<Car> newCar = new HashSet<>();
        newCar.add(car1);
        newCar.add(car2);

        System.out.println(newCar.contains(new Car("VOLVO  ", Type.AUTOMATIC)));
    }
}
