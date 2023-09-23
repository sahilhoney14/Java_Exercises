//Calculate the sum of all the elements in the given array
class arrayexample{
    void sum_of_the_array(){
        int []arr={1,2,3,4,5,6,7,8}; //this is called "literal"
        int sum =0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
        }
public class sum_of_all_the_elements {
    public static void main(String[] args) {
        arrayexample obj=new arrayexample();
        obj.sum_of_the_array();
    }
}
