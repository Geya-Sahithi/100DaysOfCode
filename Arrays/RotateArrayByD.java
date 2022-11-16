import java.util.Arrays;

public class RotateArrayByD {
    public static void rotateAnArrayByD(int a[],int n,int d) {

        int temp[] = new int[d];
        for(int i = 0;i<d;i++) {
            temp[i] = a[i];
        }
        for(int i =d;i<n;i++) {
            a[i-d] = a[i];
        }
        for(int i = 0;i<d;i++) {
            a[n-d+i] = temp[i];
        }

    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int d = 3;
        int n = a.length;
        System.out.println(Arrays.toString(a));
        rotateAnArrayByD(a, n, d);
        System.out.println(Arrays.toString(a));
    }
}






