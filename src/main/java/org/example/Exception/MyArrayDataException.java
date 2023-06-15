package org.example.Exception;

public class MyArrayDataException extends Exception {

    /**
     *
     * @param i - first coordinate in 2D array
     * @param j - first coordinate in 2D array
     * @param value - value of cell
     */
    public MyArrayDataException(int i, int j, String value) {
        super("Expected integer number at position [" + i + ", " + j
                + "] , but received value \""+ value + "\".");
    }
}
