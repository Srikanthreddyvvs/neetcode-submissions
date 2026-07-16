class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return 1;
        int l = 0;
        int count=0;
        for(int r=1;r<n;r++){
            if(nums[r]!=nums[l]){
                l++;
                nums[l]=nums[r];
            }else{
                count++;
            }
        }
        return n-count;
    }
}