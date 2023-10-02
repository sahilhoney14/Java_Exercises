//How to print two dimenssional array in user define array?

import java.util.Scanner;

public class userMultiDimensionalArray {
    static void printarray(int [][]arr){
        for (int i=0;i<arr.length;i++){             //row
            for (int j=0;j<arr[i].length;j++){     //column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row number");
        int r=sc.nextInt();
        System.out.println("enter the column number");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];

        System.out.println("enter the "+r*c+" array element");

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printarray(arr);
    }
}
