//write a program to multiple of two matrices

import java.util.Scanner;

public class twomultiarray {
    static void printmatrices(int[][]matrices){
        for (int i=0;i<matrices.length;i++){
            for (int j=0;j<matrices[i].length;j++){
                System.out.print(matrices[i][j]);
            }
            System.out.println();
        }

    }
    static void mul(int[][]a,int r1,int c1,int[][]b,int r2,int c2){
        if (c1!=r2){
            System.out.println("wrong input");
            return;
        }
        int[][]mul=new int[r1][c2];
        for (int i=0;i<r1;i++){        //row
            for (int j=0;j<c2;j++){    //column
                for(int k=0;k<c1;k++){

                    mul[i][j]+=(a[i][k]*b[k][j]);

                }
            }
        }
        System.out.println("multiply of two matrices a and b");
        printmatrices(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1 row size");
        int r1= sc.nextInt();
        System.out.println("enter the 1 column size");
        int c1=sc.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("enter the "+r1*c1+" element");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the size 2nd row ");
        int r2=sc.nextInt();
        System.out.println("enter the size of 2nd column");
        int c2=sc.nextInt();
        int[][]b =new int[r2][c2];

        System.out.println("enter the "+r2*c2+" element");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("first row and column matrix");
        printmatrices(a);
        System.out.println("second row ans column matrix");
        printmatrices(b);

        mul(a,r1,c1,b,r2,c2);



    }
}
