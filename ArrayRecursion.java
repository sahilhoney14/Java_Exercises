//Given an array,Print all its values recursively.

public class ArrayRecursion {
    static void Printarray(int[]arr,int idx){
//        base case
        if(idx==arr.length){
            return;
        }
//        self work
        System.out.println(arr[idx]);

//        recursive work
        Printarray(arr,idx+1);

    }
    public static void main(String[] args) {
        int []arr={5,6,7,8,9};
        Printarray(arr,0);
    }
}
