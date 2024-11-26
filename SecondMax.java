
package Assignment;

public class SecondMax {
    public static void main(String  args[]) {
        int[] numbers = {5, 2, 9, 1, 7};
        
        int max = numbers[0];
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max)
                max = numbers[i];        
        }
        
        int max2 = numbers[0];
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max2 && numbers[i] != max)
                max2 = numbers[i];        
        }
        
        System.out.print("Second Highest Value in Array : " + max2);
    }
}
