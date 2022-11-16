public class InsertingAnElement {
    public static int insertAnElement(int arr[],int x,int index){
        int n = arr.length;
        index = x -1;
        if(n == arr[5]) return -1;
        for(int i =n-1;i >= index; i--){
            arr[i] = arr[i+1];
        }
        arr[index] = x;
        return n+1;
    }
    
    public static void main(String[] args) {
        int arr[] = new int[5];
            System.out.println(insertAnElement(arr, 2, 1));
    }
}
