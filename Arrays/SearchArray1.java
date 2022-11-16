public class SearchArray1{
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,6,3,7,4};
        int key = 9;

        int result = -1;
        for(int i =0; i < arr.length; i++){
            if(arr[i]==key) {
                result = i;
                break;
            }
        }
        if(result==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at " + result);
        }
    }
}