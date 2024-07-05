//Given an array of integer,Print sum of all subset in it ,output sums can be prited in any order.

public class sunsetsum {
    static void subsetsum(int a[],int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        subsetsum(a,n,idx+1,sum+a[idx]);//include
        subsetsum(a,n,idx+1,sum);
    }
    public static void main(String[] args) {
        int[]a={2,4,5};
        subsetsum(a,a.length,0,0);

    }
}
