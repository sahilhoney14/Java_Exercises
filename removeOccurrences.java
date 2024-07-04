//Remove the Occurrences of 'a'from string s="abcaz"

import java.util.Scanner;

public class removeOccurrences {
    static String removeA(String s,int idx){
        if(idx==s.length()) return "";
        String smallans=removeA(s,idx+1);
        char currentchar=s.charAt(idx);
        if(currentchar !='a'){
            return currentchar+smallans;
        }else
            return smallans;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeA(s,0));

    }
}
