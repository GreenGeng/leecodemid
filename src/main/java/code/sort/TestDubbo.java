package code.sort;

public class TestDubbo {
    public static void main(String[] args) {
        int[] nums={5,0,8,9,7};
        testDubbo(nums);
        for(int n:nums){
            System.out.println(n);
        }
    }
    static void testDubbo(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    int t = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }
}
