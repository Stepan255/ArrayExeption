package org.example.Exception;

public class MyArraySizeException extends Exception {
    /**
     * Exception thrown when the number of arrays of a two-dimensional array is incorrect
     * @param errorSize - array size
     * @param expectedSize - expected array size
     */
    public MyArraySizeException(int errorSize, int expectedSize) {
        super("Column length is " + errorSize + " and not valid. Expected length "
                + expectedSize + ".");
    }

    /**
     * Exception thrown when array @numberArray is wrongly sized
     * @param numberArray - number array
     * @param errorSize - array size
     * @param expectedSize - expected array size
     */
    public MyArraySizeException(int numberArray, int errorSize, int expectedSize) {
        super("In column " + numberArray + ". Length row " + errorSize
                + " not valid. Expected length " + expectedSize + ".");
    }
}
