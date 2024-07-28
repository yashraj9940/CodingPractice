class Solution {
  
    public int numEnclaves(int[][] board) {
    {
          int ans=0;
        int n = board.length;
        int m = board[0].length;
        boolean visited[][] = new boolean[n][m];
        int check[][] = new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            dfs(check,board,n,m,i,0,visited);
        }
        for(j=0;j<m;j++)
        {
            dfs(check,board,n,m,0,j,visited);
        }
        for(i=0;i<n;i++)
        {
            dfs(check,board,n,m,i,m-1,visited);
        }
        for(j=0;j<m;j++)
        {
            dfs(check,board,n,m,n-1,j,visited);
        }
        for(i= 0;i<n;i++)
        {
            for(j =0;j<m;j++)
            {
                if(board[i][j] == 1 && !visited[i][j] )
                ans++;
            }
        }
        return ans;
    }
    }
    public void dfs(int check[][], int [][]b, int n,int m, int i,int j,boolean visited[][])
    {
        if(i<0 || j<0 || i>=n || j>=m)
        return;
        if(b[i][j] == 0 || visited[i][j])
        return;
        //if(b[i][j] == 1)
        check[i][j] = 1;
        visited[i][j] = true;
        dfs(check,b,n,m,i+1,j,visited);
        dfs(check,b,n,m,i-1,j,visited);
        dfs(check,b,n,m,i,j+1,visited);
        dfs(check,b,n,m,i,j-1,visited);
    }
}