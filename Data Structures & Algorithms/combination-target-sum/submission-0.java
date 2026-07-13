class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();
        find(list, new ArrayList<>(), 0, 0, target, nums);

        return list;
    }

    public void find(List<List<Integer>> output, ArrayList<Integer> list, int index, int sum, int target, int []nums){

        if(target == sum){
            output.add(new ArrayList<>(list));
            return;
        }

        if(index == nums.length || target < sum){
            return;
        }

        int num = nums[index];
        list.add(num);
        find(output, list, index, sum+num, target, nums);
        list.remove(list.size()-1);
        find(output, list, index+1, sum, target, nums);
    }
}
