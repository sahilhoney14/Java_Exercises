//print a spiral matrix


import java.util.Scanner;

public class printspiral {
    static void printmatrix(int [][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printspiralorder(int matrix[][],int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalelement=0;

        while(totalelement<r*c){
            //toprow->leftcol to right col
            for (int j=leftcol;j<=rightcol && totalelement<r*c;j++){
                System.out.print(matrix[toprow][j]+" ");
                totalelement++;
            }
            toprow++;
            //rightcol->toprow to bottomrow
            for (int i=toprow;i<=bottomrow && totalelement<r*c;i++){
                System.out.print(matrix[i][rightcol]+" ");
                totalelement++;
            }
            rightcol--;
            //bottomrow->rightcol to leftcol
            for (int j=rightcol;j>=leftcol&&totalelement<r*c;j--){
                System.out.print(matrix[bottomrow][j]+" ");
                totalelement++;
            }
            bottomrow--;
          //  leftcol->bottomrow to top row
            for (int i=bottomrow;i>=toprow;i--){
                System.out.print(matrix[i][leftcol]+" ");
                totalelement++;
            }
            leftcol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns of a matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
         int [][]matrix=new int[r][c];
         int total=r*c;
        System.out.println("enter"+total+"number of matrix");
        for (int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
            System.out.println("Input matrix");
            printmatrix(matrix);

            System.out.println("Spiral order");
            printspiralorder(matrix,r,c);
        }
    }
