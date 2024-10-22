//find out the median of the array.

import java.util.Scanner;

public class leetcode4 {
    static void printarray(int[]num3){
        for (int i=0;i<num3.length;i++){
            System.out.print(num3[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        System.out.println("enter the first size of the array");
        int n = sc.nextInt();
        int[] num1 = new int[n];
        System.out.println("enter the second size of array");
        int m = sc.nextInt();
        int[] num2 = new int[m];
        System.out.println("enter array element");
        for (int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }
        System.out.println("enter the second element of the array");
        for (int i = 0; i < num2.length; i++) {
            num2[i] = sc.nextInt();
        }
        int[] num3 = new int[num1.length + num2.length];
        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            num3[i + num1.length] = num2[i];
        }
        for (int i=0;i<num3.length;i++){
             ans+=num3[i];
        }
        int median=ans/num3.length;
        printarray(num3);
        System.out.println(ans);
        System.out.println(median);
    }
}
