class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLen=1;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int count=1;
            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    num++;
                    count++;
                }
            }
            maxLen=Math.max(maxLen,count);
        }
        return maxLen;
    }
}
