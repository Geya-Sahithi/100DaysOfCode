//Efficient Solution
public class MaxSumSubArray2 {
    public static int maxSubarray(int a[]) {
        // int res = a[0];
        // int maxResult = a[0];
        // for(int i = 1;i<a.length;i++) {
        //     maxResult = Math.max(maxResult+a[i],a[i]);
        //     res = Math.max(res,maxResult); 
        // }
        // return res;
        int res = a[0];
        int maxResult = a[0];
        for(int i = 1;i<a.length;i++) {
            maxResult = Math.max(maxResult+a[i], a[i]);
            res = Math.max(res, maxResult);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,7,8,-1,-2};
        
        System.out.println(maxSubarray(a));
    }
}







