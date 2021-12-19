package multiDimentionalArray;

import java.util.Formatter;

public class Matrix {
    // Minimum num of range
    private int min;

    // Maximum num of range
    private int max;

    // Num of rows
    private int row;

    // Num of columns
    private int col;

    private Formatter formatter = new Formatter(System.out);

    public Matrix() {
    }

    public Matrix(int min, int max, int row, int col) {
        this.min = min;
        this.max = max;
        this.row = row;
        this.col = col;
    }

    public int[][] generateMatrix() {
        int[][] matrix = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = (int) ((Math.random() * (max - min)) + min);
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                formatter.format("%4s",matrix[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        if (row > 0) {
            this.row = row;
        }
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        if (col > 0) {
            this.col = col;
        }
    }
}
