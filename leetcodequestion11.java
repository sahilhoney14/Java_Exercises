public class leetcodequestion11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                int w = j - 1;
                int h = Math.min(height[i], height[j]);
                int currwater = w * h;

                ans = Math.max(ans, currwater);

            }
        }
        System.out.println(ans);
    }


    }

