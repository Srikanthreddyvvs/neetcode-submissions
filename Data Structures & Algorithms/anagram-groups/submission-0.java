class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int[] freq = new int[26];
            for(int j=0;j<strs[i].length();j++){
                freq[strs[i].charAt(j)-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int count : freq){
                key.append('#').append(count);
            }
            map.putIfAbsent(key.toString(),new ArrayList<>());
            map.get(key.toString()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
