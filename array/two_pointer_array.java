//Problem based on two pointer approach
//Q- Sort an array consisting of only 0s and 1s.

//arr=100101100
//ans=000001111 = Sorted array


import java.util.Scanner;

public class two_pointer_array {
    static void printArray(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int [] arr,int i,int j) {
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]= arr[temp];
    }
    static  void sortzeroAndOne(int[]arr) {
        int n= arr.length;
        int zeros=0;
        //count number of zeroes
        for (int i=0;i<n;i++) {
            if (arr[i]==0) {
                zeros++;
            }
        }
        //0 to zero -1: 0,zeroes to n-1:1
        for (int i=0;i<n;i++){
            if (i<zeros){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[]arr=new int[n];

        System.out.println("enter "+n+ " no of element");
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array: ");
        printArray(arr);
        sortzeroAndOne(arr);
        System.out.println("sorted array: ");
        printArray(arr);

        }

    }

