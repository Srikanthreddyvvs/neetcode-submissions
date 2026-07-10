class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater=0;
        for(int i=0;i<n;i++){
            int x=i+1;
            int rightMax=0;
            while(x<n){
                rightMax = Math.max(rightMax,height[x]);
                x++;
            }
            int y=i-1;
            int leftMax=0;
            while(y>=0){
                leftMax = Math.max(leftMax,height[y]);
                y--;
            }
            int water = Math.min(rightMax,leftMax)-height[i];
            if(water>0) totalWater = totalWater+water;
        }
        return totalWater;
    }
}
