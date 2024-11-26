
package Assignment;

public class ResizeArray {
    public static void main (String args[]) {
        int[] numbers = {5, 2, 9, 1, 7};
        
        int[] numbers2 = new int[10];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }
        
        for(int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
    }  
}
