class Solution {
    public int minDifference(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        if(n<=4)
        {
            return 0;
        }
        //leave 3 largest elements
        int diff1=nums[n-4]-nums[0];

        //leave 3 smallest element
        int diff2=nums[n-1]-nums[3];

        //leave 2 largest and 1 smallest
        int diff3=nums[n-3]-nums[1];

        //leave 2 smallest 1 largest
        int diff4=nums[n-2]-nums[2];

        return Math.min(diff1,Math.min(diff2,Math.min(diff3,diff4)));
       
        
    }
}