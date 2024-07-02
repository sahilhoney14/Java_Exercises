//given two number x and y.Find the Greatest common divisor of x and y using recrsion.
 //x=24
//y=15

import java.util.Scanner;

public class recrucsionGCD {
    static int  grestestno(int x,int y){
        while(x%y!=0){
           int reminder=x%y;
           x =y;
           y=reminder;

        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println(grestestno(x,y));

    }
}
