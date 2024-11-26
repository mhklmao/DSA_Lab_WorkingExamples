
package Assignment;

public class ImplementArray {
    
    static int add(int arr[],int n, int key, int capacity){
        if (n >= capacity)
            System.out.println("Out of Space");

        arr[n] = key;
        return n + 1;
    }
    
    static void edit(int arr[], int n, int key, int replace){
        
        int pos = 0;
        
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                pos = i;

        
        arr[pos] = replace;        
    }   
    
    static int delete(int arr[],int n, int key){
        int pos = 0;
        
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                pos = i;
        
        for (int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        
        return n - 1;
    }

    

    public static void main(String args[]) {
        
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        
        int n = arr.length;
        
        System.out.println("Array : ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        n = add(arr, 4, 5, 6);
        System.out.println("\nArray After Adding an Element: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        edit(arr, 5, 2, 10);
        System.out.println("\nArray After Editting an Element: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        n = delete(arr, 5, 10);
        System.out.println("\nArray After Deleting an Element: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}
