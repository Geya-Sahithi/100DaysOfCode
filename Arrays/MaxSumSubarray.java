// Naive solution

public class MaxSumSubarray {
    public static int maxSubarray(int a[]) {
        int res = a[0];
        for (int i = 0; i < a.length; i++) {
            int curr = 0;
            for (int j = i; j < a.length; j++) {
                curr = curr + a[j];
                res = Math.max(res,curr); 
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,-1,-8,7,2,-1,5};

        System.out.println(maxSubarray(a));
    }
}
