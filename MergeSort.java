
class MergeSort {

    int[] a = { 22, 58, 47, 96, 45, 32, 12 };
    int[] b = new int[a.length];

    void merging(int low, int mid, int high) {
        int ll, l2, i;
        ll = low;
        l2 = mid + 1;
        int l = low;

        while (ll <= mid && l2 <= high) {
            if (a[ll] <= a[l2]) {
                b[l++] = a[ll++];
            } else {
                b[l++] = a[l2++];
            }
        }

        while (ll <= mid) {
            b[l++] = a[ll++];
        }

        while (l2 <= high) {
            b[l++] = a[l2++];
        }

        for (i = low; i <= high; i++) {
            a[i] = b[i];
        }
    }

    void sort(int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merging(low, mid, high);
        }
    }
    

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int i;
        int max = obj.a.length;
        System.out.println("Array before sorting\n");

        for (i = 0; i < max; i++) {
            System.out.println(obj.a[i]);
        }

        obj.sort(0, max - 1);

        System.out.println("\nArray after sorting\n");

        for (i = 0; i < max; i++) {
            System.out.println(obj.a[i]);
        }
    }
}