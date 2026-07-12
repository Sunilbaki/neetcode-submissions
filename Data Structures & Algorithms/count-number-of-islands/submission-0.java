class Solution {

    int []rows = {-1, 1, 0, 0};
    int []cols = {0, 0, -1, +1};

    int m;
    int n;

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean [][]visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(char [][]grid, int row, int col, boolean [][]visited){
        visited[row][col] = true;

        for(int i=0; i<4; i++)
        {
            int newRow = row+rows[i];
            int newCol = col+cols[i];

            if((newRow >=0 && newRow < m) && (newCol >=0 && newCol < n) &&
                grid[newRow][newCol] != '0' && !visited[newRow][newCol] ){
                    dfs(grid, newRow, newCol, visited);
                }
        }

    }
}
