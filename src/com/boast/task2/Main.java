package com.boast.task2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Bondarenko Oleh on 22.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        int dimensions = 7;

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        int[][]matrix = new int[dimensions][dimensions];

        matrixGenerate(matrix);
        matrixShow(matrix);
        System.out.println();
        matrixShift(matrix, k);
        matrixShow(matrix);

    }

    private static void matrixGenerate(int[][] matrix) {
        Random rand = new Random();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(200) - 100;
            }
        }
    }

    private static void matrixShow(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void matrixShift(int[][] matrix, int shift) {
        for(int i = 0; i < matrix.length; i++) {
            int[] helpMatrix = Arrays.copyOf(matrix[i], matrix[i].length);
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = helpMatrix[(j + shift) % helpMatrix.length];
            }
        }
    }
}
