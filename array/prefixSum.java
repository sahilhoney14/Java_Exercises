import java.util.Scanner;
import java.util.Stack;

public class prefixSum {
    static void arrayprint(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    static int[]makePrefixArray(int[]arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("enter the "+n+" no of element");

         for (int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
        System.out.println();
        System.out.println("original array");
        arrayprint(arr);

        int[]pref=makePrefixArray(arr);
        arrayprint(pref);

    }

}
