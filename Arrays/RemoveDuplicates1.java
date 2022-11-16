import java.util.Arrays;

//Do it again. Not with hashmap, with arrays itself. Come back in 2 days.

class RemoveDuplicates1
{ 
    static int remDups(int arr[]) {
        int result = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[result - 1] != arr[i]) {
                arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }
    public static void main(String args[]) 
    { 
       int arr[] = {10, 20, 20, 30, 30, 30};
  
        System.out.println(Arrays.toString(arr));
        remDups(arr);
        System.out.println(Arrays.toString(arr));    
    } 
}


 

