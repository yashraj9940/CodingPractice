class Solution {
    int k=0;
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new ArrayDeque<>();
        int r=grid.length,c=grid[0].length;
        int vis[][]=new int[r][c];
        int fresh=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                else
                {
                    vis[i][j]=0;
                    if(grid[i][j]==1)
                    fresh++;
                }
            }
        }
        int max=0;
        while(!q.isEmpty())
        {
            int i=q.peek().first;
            int j=q.peek().second;
            int t=q.peek().time;
            max=Math.max(max,t);
            q.remove();
            lookneighbour(q,vis,grid,i-1,j,r,c,t);
            lookneighbour(q,vis,grid,i,j-1,r,c,t);
            lookneighbour(q,vis,grid,i,j+1,r,c,t);
            lookneighbour(q,vis,grid,i+1,j,r,c,t);
        }
        if(k!=fresh)
         return -1;
        return max;
    }
    void lookneighbour(Queue<Pair> q,int[][] vis,int[][] grid,int r,int c,int m,int n,int t)
    {
        if(r<m && c<n && r>=0 && c>=0 && grid[r][c]==1 && vis[r][c]==0)
        {       vis[r][c]=1;
              
                q.add(new Pair(r,c,t+1));
                k++;
                return;
        }
    }
}
class Pair{
    int first;
    int second;
    int time;
    Pair(int f,int s,int t)
    {
        first=f;
        second=s;
        time=t;
    }
}  