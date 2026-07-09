class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int k=0;k<n;k++){
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i=k+1,j=n-1;
            while(i<j){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0 && i!=k && j!=k){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;
                    j--;
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }
                    while(i<j && nums[j]==nums[j+1]){
                        j--;
                    }
                }
                if(sum<0){
                    i++;
                }
                if(sum>0){
                    j--;
                }
            }
        }
        return ans;
    }
}
