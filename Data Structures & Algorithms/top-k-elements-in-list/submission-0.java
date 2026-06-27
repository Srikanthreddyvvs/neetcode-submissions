class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> q = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            q.add(ent);
        }
        int X=k;
        int i=0;
        while(X>0){
            int num = q.poll().getKey();
            ans[i]=num;
            i++;
            X--;
        }
        return ans;
    }
}
