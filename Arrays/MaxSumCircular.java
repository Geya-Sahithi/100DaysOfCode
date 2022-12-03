public class MaxSumCircular {
    public static int maxCircularSubarraySum(int a[]) {
        int res = Integer.MIN_VALUE,currSum = 0;
        for(int i = 0; i < a.length; i++) {
            currSum = Math.min(currSum, a[i]);
            res = Math.min(currSum, res);
        }
        for(int i = 0;i<a.length;i++){
            a[i] += a[i+1];
            res +=a[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int a[] = {1,2,3,-6,4,-3,8};

        System.out.println(a);
    }
}
