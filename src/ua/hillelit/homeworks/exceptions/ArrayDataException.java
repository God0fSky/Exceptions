package ua.hillelit.homeworks.exceptions;

public class ArrayDataException extends RuntimeException {

    private int row;
    private int column;

    public ArrayDataException(String s, int row, int column) {
        super(s);
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
