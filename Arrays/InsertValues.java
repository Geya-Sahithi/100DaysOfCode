import java.util.Arrays;
import java.util.Scanner;

public class InsertValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr + " ");
        // }

        // for(int e:arr){
        //     System.out.print(e + " ");
        // }

        System.out.println(Arrays.toString(arr)); //best method to print array 

        //Replacing an element in an array
        arr[1] = 5;
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}


