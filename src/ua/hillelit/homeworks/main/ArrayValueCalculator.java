package ua.hillelit.homeworks.main;

import ua.hillelit.homeworks.exceptions.ArrayDataException;
import ua.hillelit.homeworks.exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public static int doCalc(String arr[][]) throws ArraySizeException {
        arraySizeValidator(arr);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nullValidator(arr[i][j]);
                sum = arrayDataValidator(arr[i][j], sum, i, j);
            }
        }
        return sum;
    }

    private static void arraySizeValidator(String arr[][]) {
        if (arr.length != 4) {
            throw new ArraySizeException("Неверный размер массива!");
        } else {
            for (int i = 0; i < 4; i++) {
                if (arr[i].length != 4) {
                    throw new ArraySizeException("Неверный размер массива!");
                }
            }
        }
    }

    private static void nullValidator(String arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
    }

    private static int arrayDataValidator(String arr, int sum, int i, int j) {
        try {
            sum += Integer.parseInt(arr);
        } catch (NumberFormatException e){
            throw new ArrayDataException("Неверный формат в ячейке: ", i, j);
        }
        return sum;
    }

}

