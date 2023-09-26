import java.util.Scanner;

public class another_way_zeros_and_one_array {
    static void printarray(int[]arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swaparray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void another_way(int[]arr){
        int n=arr.length;

        int left=0 , right=n-1;

         while (left<right){
             if (arr[left]==1 && arr[right]==0 ) {
                 swaparray(arr,left, right);
                 left++;
                 right--;
             }
                 if (arr[left]==0) {
                     left++;
                 }
                 if (arr[right]==1) {
                     right--;
                 }
             }
         }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter the "+n+" number of array element");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the original array");
        printarray(arr);
        another_way(arr);

        System.out.println("SHORTED ARRAY");
        printarray(arr);

    }
}
