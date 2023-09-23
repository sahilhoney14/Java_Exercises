//Calculate the maximum value out off all the element in the array
class maximum_value{
    void max_value(){
        int[]arr={1,32,5,6,3,6,3,6,2};
        int max=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum "+ max);
    }
}

public class maximum_value_element {
    public static void main(String[] args) {
        maximum_value obj= new maximum_value();
        obj.max_value();
    }
}
