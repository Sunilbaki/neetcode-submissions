class Solution {
    int []rows = {-1, 1, 0, 0};
    int []cols = {0, 0, 1, -1};

    int m;
    int n;

    public int orangesRotting(int[][] grid) {

        m = grid.length;
        n = grid[0].length;

        int fresh = 0;
        int min = 0;
        Queue<int []> queue = new LinkedList<>();

        for(int i=0;i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                 fresh++;
                else if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                }
                
            }
        }


        while(!queue.isEmpty() && fresh !=0 ){
            int nx = queue.size();
            while(nx!=0)
            {
                 int []node = queue.poll();
                 int row = node[0];
                 int col = node[1];
                 for(int i=0;i<4;i++){
                    int newRow = row+rows[i];
                    int newCol = col+cols[i];

                    if( (newRow >= 0 && newRow < m) &&
                        ( newCol >= 0 && newCol < n))
                        {
                            if(grid[newRow][newCol] == 1){
                                grid[newRow][newCol]=2;
                                fresh--;
                                queue.offer(new int[]{newRow, newCol});
                            }
                        }
                 }

                 nx--;
            }
            min++;
        }
        
        if(fresh !=0) return -1;
        return min;
    }

    
}
