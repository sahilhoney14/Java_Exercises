public class leetcodequestion27 {
    static int element(int []nums,int val){
        int output=0;
        for (int i=0;i<nums.length;i++){
            if (val!=nums[i]){
                nums[output]=nums[i];
                output++;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[]nums={3,2,2,3};
        int val=2;
        System.out.println(element(nums,val));

    }
}
