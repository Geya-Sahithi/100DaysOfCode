public class SecondLargestElement1 {
    public static int SecondLargest(int arr[],int l,int sl){
    int n = arr.length;
    if(n < 2) return -1;
    l = 0;
    sl = -1; 
    for(int i = 0; i<n ; i++){
        if(arr[i] > arr[l]){
            sl = l;
            l = i;
        }else if(arr[i] < arr[l]){
            if(sl == -1 || arr[i] > arr[sl]) {
                sl = i;
            }
        }
    }
        return arr[sl];
    }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    int l = -1;
    int sl = 0;
    
    System.out.println(SecondLargest(arr, l, sl));
    }
}





