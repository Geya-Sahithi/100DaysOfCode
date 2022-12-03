public class LongestOddEvenSubarray {
    public static int longestOddEvenSubarray(int a[]) {
        int res = 1;
        for(int i = 0;i<a.length;i++) {
            int curr = 1;
            for(int j = i+1;j<a.length;j++) {
                if(a[j]%2 == 0 &&a[j-1] %2 !=0 || a[j]%2 != 0 &&a[j-1] %2 ==0 ) 
                curr++;
                else
                break;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        System.out.println(longestOddEvenSubarray(a));
    }
}
