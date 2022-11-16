public class LargestElement1 {
    public static int largestElementArray(int arr[], int l) {
        int n = arr.length;
        if(n<1) return n;
        for(int i = 0; i < n; i++){
            if(arr[i]>l){
                l = arr[i]; 
            }
        }
        return l;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,19,7,8,9};
        int l = Integer.MIN_VALUE;
        System.out.println(largestElementArray(arr,l));
    }
}