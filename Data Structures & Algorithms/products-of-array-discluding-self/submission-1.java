class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int zCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }else{
                zCount++;
            }
        }
        if(zCount>1){
            return new int[n];
        }else if(zCount==1){
            int[] res = new int[n];
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    res[i]=prod;
                    return res;
                }
            }
        }
            int[] res = new int[n];
            for(int i=0;i<n;i++){
                res[i]=prod/nums[i];
            }
            return res;
        

    }
}  
