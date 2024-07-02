//Print the max value of the array.

public class valueofthearray {
    static int maxInArray(int arr[],int idx){
        if(idx==arr.length-1){
            System.out.println();
            return arr[idx];
        }
        int smallans=maxInArray(arr,idx+1);

        return Math.max(arr[idx],smallans);


    }

    public static void main(String[] args) {
        int arr[]={3,10,3,2,5};
//        maxInArray(arr,0);
        System.out.println(maxInArray(arr,0));

    }
}
