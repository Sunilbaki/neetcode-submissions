class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int left = 0;
        int right = heights.length-1;

        while(left<right)
        {
            int maxArea = Math.min(heights[left], heights[right])*(right-left);
            ans = Math.max(ans, maxArea);

            if(heights[left]>heights[right])
              right--;
            else if(heights[left]<=heights[right])
             left++;

        }

        return ans;
    }
}
