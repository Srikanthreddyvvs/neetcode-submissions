class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int count=0;
        int l = 0;
        int r = n-1;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                count++;
                l++;
                r--;
            }else if(people[r]<=limit){
                count++;
                r--;
            }else if(people[l]<=limit){
                count++;
                l++;
            }
        }
        return count;
    }
}