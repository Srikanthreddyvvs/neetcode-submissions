class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i=0,j=n-1;
        int maxAmt = 0;
        while(i<j){
            int amt = Math.min(heights[i],heights[j])*(j-i);
            maxAmt = Math.max(maxAmt,amt);
            if(heights[i]<=heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxAmt;
    }
}
