public class leetcodequestion35 {
        public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length;
            while (start <= end) {
                int mid = start + (end + start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return end;

        }
    public static void main(String[] args) {
            int[] nums={1,3,5,6};
            int target=5;
            leetcodequestion35 solution=new leetcodequestion35();
            int result= solution.searchInsert(nums,target);
        System.out.println(result);



    }
}
