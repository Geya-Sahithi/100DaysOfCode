import java.util.Arrays;

public class Reverse {
    public static void reverseAnArray(int a[]) {
        int n = a.length;
        int low = 0;
        int high = n-1;
        while(low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(a));
        reverseAnArray(a);
        System.out.println(Arrays.toString(a));
    }
}














