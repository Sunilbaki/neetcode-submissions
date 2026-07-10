class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    static void find(List<List<Integer>> ans, ArrayList<Integer> temp, int []nums, int size){

        if(nums.length == size){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[size]);
        find(ans, temp, nums, size+1);
        temp.remove(temp.size()-1);
        find(ans, temp, nums, size+1);

    }
}
