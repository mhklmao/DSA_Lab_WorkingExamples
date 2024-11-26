
package Assignment;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 5, 0, 2, 0, 14, 18, 0};

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }       
    }
}
