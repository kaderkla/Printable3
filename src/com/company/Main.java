package com.company;

import printableClasses.MyArray;
import printableClasses.PrintableList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Integer[] testArray ={1,2,3};

        MyArray myArray = new MyArray();
        MyArray testMyArray = new MyArray();
        myArray.setArray(testArray);
        myArray.printArray();
        testMyArray.setArray(myArray.getArray().toArray());
        testMyArray.printArray();

        PrintableList printableList=myArray;


    }
}
