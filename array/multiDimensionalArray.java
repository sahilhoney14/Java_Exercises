//How to print two dimenssional array?

public class multiDimensionalArray {
    static void printarray(int [][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]arr2= {
                {1, 5, 6},
                {7, 9, 11},
                {8, 1, 1}
        };
        printarray(arr2);
    }
}
