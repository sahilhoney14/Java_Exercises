import java.util.Scanner;

public class short_array_even_odd {
    static void arrayprint(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void swaparray(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void even_odd(int[] arr){
        int n=arr.length;
        int left=0, right=n-1;

        while(left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swaparray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1)
                right--;
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int []arr=new int[n];

        System.out.println("enter the "+n+" number of the element");

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        arrayprint(arr);
        even_odd(arr);
        System.out.println("even and odd array");
        arrayprint(arr);

    }
}
