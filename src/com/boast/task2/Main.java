package com.boast.task1;

import java.util.Scanner;
import com.boast.Matrix;

/**
 * Created by Bondarenko Oleh on 22.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        int matrixSize = 7;

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        Matrix matrix = new Matrix(matrixSize, matrixSize);

        matrix.generate();
        matrix.show();
        System.out.println();
        matrix.leftShift(k);
        matrix.show();
    }
}
