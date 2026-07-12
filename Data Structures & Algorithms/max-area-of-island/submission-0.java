class Solution {
    int count =0; 
    int max = count;

    int m;
    int n;

    int []rows = {1, -1, 0, 0};
    int []cols = {0 , 0, -1, 1};
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        boolean [][]visited = new boolean[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(!visited[i][j] && grid[i][j] == 1){
                    count = 1;
                    dfs(grid, visited, i, j);
                    max = Math.max(max, count);
                }
            }
        }

        return max;
        
    }

    public void dfs(int [][]grid, boolean [][]visited, int row, int col)
    {
        visited[row][col]= true;
        for(int i=0;i<4;i++){
            int newRow = row+rows[i];
            int newCol = col+cols[i];

            if( (newRow >= 0 && newRow < m) &&
                (newCol >=0 && newCol < n) && 
                (!visited[newRow][newCol] && grid[newRow][newCol] == 1)){
                    count++;
                    dfs(grid, visited, newRow, newCol);
                }
        }
    }
}
