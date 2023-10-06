//Q-Write a program to display transpose of matrix enter by user.

import java.util.Scanner;

public class transpose_matrix {
    static void printmatrix(int[][]matrix){
        for (int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][]findTranspose(int [][]matric,int r,int c){
        int[][]ans=new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=matric[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row and column of array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][]matrix=new int[r][c];
        int totalelement=r*c;
        System.out.println("enter "+totalelement+" values");
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printmatrix(matrix);

        System.out.println("Transpose of matrix");
        int[][]ans=findTranspose(matrix,r,c);
            printmatrix(ans);
        }
    }
