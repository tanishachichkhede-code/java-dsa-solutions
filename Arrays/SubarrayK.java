class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        int sum =0;
        int count=0;
        for(int num:nums){
            sum=sum+num;
            int prefix =sum-k;

            if(map.containsKey(prefix)){
                count=count+map.get(prefix);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}