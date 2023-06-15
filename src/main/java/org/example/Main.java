package org.example;

import org.example.Exception.MyArrayDataException;
import org.example.Exception.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arrayInts = new String[][]{
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };

        try {
            System.out.println(ArraySummer.sum(arrayInts));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }
}