class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int []output = {-1,-1};

        for(int i=0;i<nums.length; i++)
        {
            int val = target-nums[i];
            if(map.containsKey(val))
            {
               int indexI = map.get(val);
               output[0]=indexI;
               output[1]=i;
               return output; 
            }
            map.put(nums[i], i);
        }

        return output;
    }
}
