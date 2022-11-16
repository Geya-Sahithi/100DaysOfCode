import java.util.Arrays;

public class LeftRotateD {
    public static void leftRotateByD(int a[]) {
        int temp = a[0];
        for(int i = 1;i < a.length;i++) {
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
    }
    public static void rotateTimes(int a[],int d){
        for(int i = 1;i < d;i++) {
            leftRotateByD(a);
        }
    } 
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        leftRotateByD(a);
        rotateTimes(a, 3);
        System.out.println(Arrays.toString(a));
        
    }
}


