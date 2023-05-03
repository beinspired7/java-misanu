package org.functional.Methods_12;
//@author Milica Jaric

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task282_Methods29 {
static void prikaziMatricu(int matrica[][], int n) {
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++)
System.out.print(" " + matrica[i][j]);


        System.out.println();
    }
}

static void zameniElemente(int matrica[][], int n) {
    for (int i = 1; i <= n; i++) {
        int tmp = matrica[i][i];
        matrica[i][i] = matrica[i][n - i + 1];
        matrica[i][n - i + 1] = tmp;
    }
}

public static void main(String[] args) throws Exception {
    int[][] matrica = new int[10][10];

    BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the matrix dimension: ");
    int n = Integer.parseInt(ulaz.readLine());

    System.out.println("Enter matrix elements: ");
    for (int i = 1; i <= n; i++)
        for (int j = 1; j <= n; j++) {
            System.out.print("matrica[" + i + "]" + "[" + j + "]: ");
            matrica[i][j] = Integer.parseInt(ulaz.readLine());
        }

    System.out.println("Printing matrix before swapping elements");
    prikaziMatricu(matrica, n);

    System.out.println("Printing matrix after swapping elements");
    zameniElemente(matrica, n);
    prikaziMatricu(matrica, n);
}
}
