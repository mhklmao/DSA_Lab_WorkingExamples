/* Q : Sum of first n Natural Numbers */

package com.mycompany.sumnat;

import java.util.Scanner;

public class SumNat {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum of first " +n+ " Natural numbers is : " + sum);
    }
}
