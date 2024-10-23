/*
Q : Addition of two Matrix
 */

package com.mycompany.sumnat;

import java.util.Scanner;


public class AddMatrices {

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows : ");
        int row = scanner.nextInt();
        
        System.out.println("\nEnter the number of columns : ");
        int col = scanner.nextInt();
        
        System.out.println("\n Your Matrix is a " + row + " x " + col + " Matrix \n");
        
        int [] [] matrixA = new int [row] [col] ;
        int [] [] matrixB = new int [row] [col] ;
        int [] [] matrixSum = new int [row] [col] ;
        
        System.out.println("Enter elements of First Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrixA [i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n\nEnter elements of Second Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print("\nElement [" + i + "][" + j + "]: ");
                matrixB [i][j] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                matrixSum [i][j] = matrixA [i][j] + matrixB [i][j];
            }
        }
        
        System.out.println("\n\n Sum of the two Matrices is : ");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                System.out.print(matrixSum [i][j] + "\t");
            }
            System.out.println();
        }
    }
}
