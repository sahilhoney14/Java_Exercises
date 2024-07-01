//Given a number n.Find the sum of natural number till n but with alternate signs.

import java.util.Scanner;

public class sumofalternatesigns {
    static int seriessum(int n){
        if(n==0)return 0;
        if(n%2==0){//even
            return seriessum(n-1)-n;
        }else{//odd
            return seriessum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        System.out.println(seriessum(n));
    }
}
