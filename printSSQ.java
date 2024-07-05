//Given a String ,Write a method to print all its subseqences.

public class printSSQ {
    static void printSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remstring=s.substring(1);
        printSSQ(remstring,currAns+curr);//adding string
        printSSQ(remstring,currAns);//do not adding string
    }
    public static void main(String[] args) {
        printSSQ("abc","");

    }
}
