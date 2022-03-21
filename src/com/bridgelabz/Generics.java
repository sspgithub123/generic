package com.bridgelabz;

public class Generics {

    public static void main(String[] args) {
        System.out.println("welcome to Generics program");
        //object creation for Integer
        MaximumNumber maxInt = new MaximumNumber();
        //method call to find max Integer
        maxInt.findMaximum(32, 23, 12);

        //object creation for Float
        MaximumNumber maxfloat = new MaximumNumber();
        //method call to find max float
        maxfloat.findMaximum(32.5f, 23.3f, 12.6f);

        //object creation for String
        MaximumNumber maxString = new MaximumNumber();
        //method call to find max String
        maxString.findMaximum("Truck", "Ford", "Car");

    }
}