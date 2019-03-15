package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data[0].length; i++) {
            for (int j = 0; j <= data[0].length; j++) {
                if (i == j) {
                    if (data[0][0] != data[i][j]) {
                        result = false;
                        break;
                    }
                }
                if (i + j == data[0].length - 1) {
                    if (data[0][data[0].length - 1] != data[i][data[0].length - 1 - i]){
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}