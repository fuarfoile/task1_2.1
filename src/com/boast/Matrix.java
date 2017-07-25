package com.boast;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Bondarenko Oleh on 22.07.2017.
 */

public class Matrix {

    private int[][] matrix;

    public Matrix(int sizeX, int sizeY) {
        matrix = new int[sizeX][sizeY];
    }

    public void generate() {
        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(200) - 100;
            }
        }
    }

    public void show() {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public void leftShift(int shift) {
        for(int i = 0; i < matrix.length; i++) {
            int[] helpMatrix = Arrays.copyOf(matrix[i], matrix[i].length);
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = helpMatrix[(j + shift) % helpMatrix.length];
            }
        }
    }
}
