//Given a square matrix ,trun it by 90 degree in a clockwise direction without using any extra space.



import java.util.Scanner;

public class turn90Degree {
    static void printmatrix(int[][]matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeinPlace(int [][]matrix,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reversearray(int[]arr){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int [][]matrix,int n){
        transposeinPlace(matrix,n,n);
        //reverse each row of transposed matrix
        for(int i=0;i<n;i++){
            reversearray(matrix[i]);
        }
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

        rotate(matrix,r);

        System.out.println("rotation of matrix");
        printmatrix(matrix);
    }
}

