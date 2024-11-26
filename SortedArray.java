
package Assignment;
 
public class SortedArray {
    
    static int Search(int arr[], int key) {
        for (int pos = 0; pos < arr.length; pos++) {
            if (arr[pos] == key) {
                return pos;
            }
        }
        return -1;
    }
    
    public static void Insert(int[] array, int key) {
        int n = array.length;
        int i = 0;

        for (i = n - 2; i >= 0 && array[i] > key; i--) {
            array[i + 1] = array[i]; 
        }

        array[i + 1] = key;    
    }
    
    public static void Delete(int[] array, int value) {
        int n = array.length;

        int index = Search(array, value);
        if (index == -1) {
            System.out.println("Element " + value + " not found.");
        }

        for (int i = index; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        
        array[n - 1] = 0;
    }
  
    public static void main (String args[]) {
       
        int[] arr = new int [7];
        arr[0] = 10; 
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        int pos = Search(arr, 30);
        System.out.print("\n");
        System.out.println("\n" + arr[pos] + " is at Index : " + pos );
        
        Insert(arr, 33);
        System.out.println("\nArray After Inserting an Element : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        Delete(arr, 40);
        System.out.println("\nArray After Deleting an Element : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
 
}
