//Given a Number num and a value K.Print k multiples of num.

import java.util.Scanner;

public class multiples1 {
    static void printmultiples(int n,int k){
        //base case
        if(k==1){
            System.out.println(n);
            return;
        }
        //recursive work

        printmultiples(n,k-1);

        //self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        printmultiples(n,k);
    }
}
