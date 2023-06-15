package org.example;

import org.example.Exception.MyArrayDataException;
import org.example.Exception.MyArraySizeException;

public class ArraySummer {
    private static final int FIRST_SIZE = 4;
    private static final int SECOND_SIZE = 4;

    public static int sum(String[][] squareArray) throws MyArraySizeException, MyArrayDataException {
        int columnSize = squareArray.length;
        if (columnSize != FIRST_SIZE) {
            throw new MyArraySizeException(columnSize, FIRST_SIZE);
        }
        int sum = 0;
        for (int i = 0; i < columnSize; i++) {
            int rowSize = squareArray[i].length;
            if (rowSize != SECOND_SIZE) {
                throw new MyArraySizeException(i, rowSize, SECOND_SIZE);
            }
            for (int j = 0; j < rowSize; j++) {
                String value = squareArray[i][j];
                try {
                    sum += Integer.parseInt(value);
                } catch (Exception NumberFormatException) {
                    throw new MyArrayDataException(i, j, value);
                }
            }
        }
        return sum;
    }
}
