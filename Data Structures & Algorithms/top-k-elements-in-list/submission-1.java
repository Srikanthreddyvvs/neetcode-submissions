class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            q.add(ent.getKey());
        }
        int X=k;
        int i=0;
        while(X>0){
            int num = q.poll();
            ans[i]=num;
            i++;
            X--;
        }
        return ans;
    }
}
