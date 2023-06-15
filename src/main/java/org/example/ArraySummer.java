package org.example;

import org.example.Exception.MyArrayDataException;
import org.example.Exception.MyArraySizeException;

public class ArraySummer {
    private static final int FIRST_SIZE = 4;
    private static final int SECOND_SIZE = 4;

    /**
     *
     * @param squareArray - square array 4X4
     * @return sum of all array elements reduced to int
     * @throws MyArraySizeException - an error in one of the sizes of a two-dimensional array
     * @throws MyArrayDataException - error casting string to int
     */
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
