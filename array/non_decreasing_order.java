//Given a integer array'a' sorted in non-decreasing order,return an array
//of the squares f each number sorted in non-decreasing order.
// arr 2   4   6   7   10
//ans  4   16  36  49  100



import java.util.Scanner;

public class non_decreasing_order {
    static void printarray(int[]arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swaparray(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int[]arr){
        int i=0,j=arr.length-1;
        while (i<j){
            swaparray(arr,i,j);
            i++;
            j--;
        }
    }
    static int[]shorted_array(int[]arr){
        int n=arr.length;
        int left=0,right=n-1;
        int[]ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        reverse(ans);
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int []arr=new int[n];

        System.out.println("enter the "+ n+" number of array element");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printarray(arr);
        int[]ans=shorted_array(arr);

        System.out.println("sorted array: ");
        printarray(ans);

    }
}
