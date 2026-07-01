class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       return find(target, matrix);
    }
      static boolean find(int target, int [][] num)
    {
        int m = num[0].length;
        int n = num.length;

        int start = 0;
        int end = (m*n)-1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            int col  = mid % m;
            int row = mid / m;

            if(num[row][col] == target){
                return true;
            } else if(num[row][col] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;

    }
}
