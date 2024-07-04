//write a program to print reverse of a string using recursion.

import java.util.Scanner;

public class remove {
    static String reverse(String s,int idx){
        if(idx==s.length()) return "";
        String smallans=reverse(s,idx+1);
        return smallans+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(reverse(s,0));
    }
}
