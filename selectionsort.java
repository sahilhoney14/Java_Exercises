public class selectionsort {
    static void selectionsort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]) {
                    minidx = j;
                }
            }
                    int temp=arr[i];
                    arr[i]=arr[minidx];
                    arr[minidx]=temp;

            }
        }
    public static void main(String[] args) {
        int[]arr={7,4,5,1,2};
        selectionsort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
