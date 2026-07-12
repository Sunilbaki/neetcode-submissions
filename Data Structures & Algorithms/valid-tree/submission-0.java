class Solution {

    public boolean validTree(int n, int[][] edges) {

        if(edges.length != n-1)
         return false;

        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

        boolean []visited = new boolean[n];

        for(int i=0; i<n; i++)
        {
            grid.add(i, new ArrayList<>());
        }

        for(int []nx : edges)
        {
            int a = nx[0];
            int b = nx[1];
            grid.get(a).add(b);
            grid.get(b).add(a);
        }

        if(!dfs(visited, grid, 0, -1))
         return false;
        
        for(int i=0; i<n; i++)
        {
            if(!visited[i]) 
             return false;
        }

        return true;
       
    }

    public boolean dfs(boolean []visited, ArrayList<ArrayList<Integer>> grid, int source, int par)
    {
        if(visited[source]){
            return false;
        }

        visited[source] = true;

        for(int neg : grid.get(source))
        {
            if(par == neg) continue;

            if(!dfs(visited, grid, neg, source))
             return false;
        }
        return true;
    }
}
