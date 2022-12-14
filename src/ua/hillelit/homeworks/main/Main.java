package ua.hillelit.homeworks.main;

import ua.hillelit.homeworks.exceptions.ArrayDataException;
import ua.hillelit.homeworks.exceptions.ArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arrStr = {
                {"4", "5", "j", "7"},
                {"1", "2", "3", "8"},
                {"11", "22", "33", "53"},
                {"-10", "-11", "-12", "-13"}};
        try {
            System.out.println(ArrayValueCalculator.doCalc(arrStr));
        } catch (ArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Элемент не может быть " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println(e.getMessage() + "[" + e.getRow() + "] " + "[" + e.getColumn() + "]");
        }
    }
}
