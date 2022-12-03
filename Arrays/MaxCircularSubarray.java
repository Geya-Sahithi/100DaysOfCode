public class MaxCircularSubarray {
    public static int maxSumCircularSubarray(int a[]) {
        int res = Integer.MIN_VALUE;
        int n = a.length;
        for(int i = 0;i<n;i++) {
            int currSum = a[i];
            int currMax = a[i];
            for (int j = 1; j < n; j++) {
                //When the remainder will become 0 then the loop 
                //will stop running because j is initialised to 1
                int index = (i+j)%n;
                currSum += a[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(currMax, res);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {1,4,9,-7,2};

        System.out.println(maxSumCircularSubarray(a));
    }
}















