//Efficient solution - I coded myself
public class MaxConsecutive {
    public static int maxConsecutive(int a[]) {
        int res = 0,count = 0;
        for(int i = 0;i<a.length;i++) {
            if(a[i] == 1){
                count++;
                count = Math.max(count,a[i]);
            }else{
                count = 0;
            }
            res = Math.max(res,count);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,1,1,1,1};

        System.out.println(maxConsecutive(a));
    }
}
