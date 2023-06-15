package org.example.Exception;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j, String value) {
        super("Expected integer number at position [" + i + ", " + j
                + "] , but received value \""+ value + "\".");
    }
}
