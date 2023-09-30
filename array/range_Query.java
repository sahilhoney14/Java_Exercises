//Given an array of integers of size n.Answer q Queries where you
//need to print the sum of value in a given range of indices from 1 to r(both included)
//note:The value of 1 and r in queries follow 1-based indexing.

import java.util.Scanner;

public class range_Query {
    static int[]makeaprefixsumarray(int[]arr){
        for (int i=1;i<arr.length;i++){
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n+1];

        System.out.println("enter "+n+" number of element");
        for (int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        int[]prefsum =makeaprefixsumarray(arr);

        System.out.print("enter number of queries");
        int q =sc.nextInt();

        while (q-->0){
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefsum[r] - prefsum[l - 1];

            System.out.println("sum: " + ans);
        }

    }
}
