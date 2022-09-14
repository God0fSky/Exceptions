package ua.hillelit.homeworks.main;

import ua.hillelit.homeworks.exceptions.ArrayDataException;
import ua.hillelit.homeworks.exceptions.ArraySizeException;

public class ArrayValueCalculator {
    public static int doCalc(String arr[][]) throws ArraySizeException {
        if (arr.length != 4) {
            throw new ArraySizeException("Неверный размер массива!");
        } else {
            for (int i = 0; i < 4; i++) {
                if (arr[i].length != 4) {
                    throw new ArraySizeException("Неверный размер массива!");
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] == null) {
                    System.out.println("Элемент не может быть null");
                    return -1;
                }
                sum += Integer.parseInt(arr[i][j]);
                /*throw new ArrayDataException("Неверный формат в ячейке: ", i, j);
                }*/
            }
            return sum;
        }
        return sum;
    }
}

