//Create a multidimensional Array

class array1{
    void  arrayex(){
        int[][]ages=new int[3][3];

        ages[0][0]=2;
        ages[0][1]=1;
        ages[0][2]=2;

        ages[1][0]=33;
        ages[1][1]=44;
        ages[1][2]=55;

        ages[2][0]=66;
        ages[2][1]=77;
        ages[2][2]=88;

        System.out.println(ages[0][0]);
        System.out.println(ages[0][1]);
        System.out.println(ages[0][2]);
        System.out.println();
        System.out.println(ages[1][0]);
        System.out.println(ages[1][1]);
        System.out.println(ages[1][2]);
        System.out.println();
        System.out.println(ages[1][0]);
        System.out.println(ages[1][1]);
        System.out.println(ages[1][2]);

    }
}
public class Multidimensionl_array {
    public static void main(String[] args) {
        array1 obj1=new array1();
        obj1.arrayex();
    }
}
