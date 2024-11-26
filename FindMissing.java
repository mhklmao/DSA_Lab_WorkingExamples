
package Assignment;

public class FindMissing {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8};

        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum = actualSum + num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
