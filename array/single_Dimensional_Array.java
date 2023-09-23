//Create a single dimensional array

 class demoarray{
    void  arrayex(){
        int[]ages=new int[3];
        String[]name=new String[3];

        ages[0]=2;
        ages[1]=1;
        ages[2]=2;

        name[0]="sahil";
        name[1]="honey";
        name[2]="aditya";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
    }
 }
public class single_Dimensional_Array {
    public static void main(String[] args) {
        demoarray obj=new demoarray();
        obj.arrayex();

    }
}


//Output
//2
//1
//2
//sahil
//honey
//aditya