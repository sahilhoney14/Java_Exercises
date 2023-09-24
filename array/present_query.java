//Given the q Queries,cheack if the given number is prensent in the array or not.
//note: Value of all the elements in the array is less than 10 to the power 5.
//
import java.util.Scanner;

public class present_query {
    static int [] makefrequencyArray(int[]arr){
        int[]freq=new int[100005]; //introduce the frequence array
        for (int i=0;i<arr.length;i++) {
            freq[arr[i]]++;

        }
        return (freq);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the "+n+" number of element");
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int[]freq=makefrequencyArray(arr);

        System.out.println("enter number of queries");
        int q=sc.nextInt();
         while(q>0){
             System.out.println("enter number of search");
             int x=sc.nextInt();
             if (freq[x]>0){
                 System.out.println("Yes");
             }else
                 System.out.println("No");
        }
         q--;

        }

    }

