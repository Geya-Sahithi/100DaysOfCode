import java.util.Arrays;

public class ZerosToTheEnd {
    public static int moveZerosToTheEnd(int a[]) {
        int count = 0;
        int temp = -1;
        for(int i = 0; i<a.length;i++) {
            if(a[i] != 0){
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count ++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int a[] = {1,2,0,0,9,7,0,0};

        System.out.println(Arrays.toString(a));
        moveZerosToTheEnd(a);
        System.out.println(Arrays.toString(a));
    }
}

