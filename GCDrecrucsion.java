//given two number x and y.Find the Greatest common divisor of x and y using recrsion.
//x=24
//y=15

import java.util.Scanner;

public class GCDrecrucsion {
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcd(x,y));

    }
}
