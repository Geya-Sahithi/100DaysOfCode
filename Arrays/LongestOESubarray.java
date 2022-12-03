public class LongestOESubarray {
    public static int longestOddEven(int a[]) {
        int res = 1;
        int count = 1;
        for(int i = 1;i<a.length;i++) {
            if(a[i]%2 ==0 && a[i-1]%2 !=0 || a[i]%2 !=0 && a[i-1]%2 ==0) 
            count++;
            else
            count = 1;
            res = Math.max(res,count);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,5,5};

        System.out.println(longestOddEven(a));    
    }
}
