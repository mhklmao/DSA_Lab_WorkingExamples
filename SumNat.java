/* Q : Sum of first 10 Natural Numbers */

package com.mycompany.sumnat;

public class SumNat {

    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i < 11; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum of first 10 Natural numbers is : " + sum);
    }
}
