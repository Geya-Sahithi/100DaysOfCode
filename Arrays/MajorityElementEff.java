//Moore's Voting Algorithm

public class MajorityElementEff {
    public static int findMajority(int a[]) {
        int n = a.length;
        int res = 0,count = 1;
        for(int i = 1;i<n;i++) {
            if(a[res] == a[i])
            count++;
            else
            count--;
            if(count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;

        for(int i = 0;i<n;i++)
            if(a[res] == a[i])
            count++;
            if(count <= n/2)
            res = -1;
        return a[res];
    }
    public static void main(String[] args) {
        int a[] = {2,2,3,4,5,2,2,4,2,2};

        System.out.println(findMajority(a));
    }
}
