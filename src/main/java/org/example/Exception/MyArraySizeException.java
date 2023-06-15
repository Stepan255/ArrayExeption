package org.example.Exception;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(int errorSize, int expectedSize) {
        super("Column length is " + errorSize + " and not valid. Expected length "
                + expectedSize + ".");
    }

    public MyArraySizeException(int numberArray, int errorSize, int expectedSize) {
        super("In column " + numberArray + ". Length row " + errorSize
                + " not valid. Expected length " + expectedSize + ".");
    }
}
