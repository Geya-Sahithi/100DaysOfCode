public class SlidingWindowE {
    public static int maximumSum(int a[], int k) {
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum = currSum + a[i];

        }
        int maxSum = currSum;

        for (int i = k; i < a.length; i++) {
            currSum = currSum + (a[i] - a[i-k]);
            
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int k = 2;

        System.out.println(maximumSum(a, k));
    }
}
