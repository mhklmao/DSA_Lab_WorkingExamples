/*
Q : Reverse an array
 */
package com.mycompany.sumnat;

import java.util.Scanner;


public class ReversedArray {


    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length of the array : ");
        int length = scanner.nextInt();

        int [] array = new int [length];
        
        System.out.println("\n\nEnter the elements of the array :");
        
        for ( int i = 0; i < length; i++) {
            
            System.out.print("\nElement [" + i + "]: ");
            array [i] = scanner.nextInt();
        }
        
        int [] reversedArray = new int [length];
        
        for (int i = 0; i < length; i++) {
            
            reversedArray [i] = array [(length - 1) - i];
        }
        
        System.out.println("\n______________________________________");
        
        System.out.println("\n\nArray :");
        
        for (int i = 0; i < length; i++) {
            
            System.out.print(array [i] + " ");
        }
        
        System.out.println("\n\nRevers5ed array :");
        
        for (int i = 0; i < length; i++) {
            
            System.out.print(reversedArray [i] + " ");
        }

    }
}
