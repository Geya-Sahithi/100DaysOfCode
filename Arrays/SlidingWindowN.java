public class SlidingWindowN {
    public static int maximumSum(int a[],int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i+k-1 < a.length; i++) {
            int sum = 0;
            for(int j = 0;j<k;j++) {
                sum = sum +a[i+j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int k = 2;

        System.out.println(maximumSum(a, k));
    }
}
