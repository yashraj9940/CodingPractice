class Solution {
    
    public int[][] updateMatrix(int[][] grid) {
       Queue<Pair> q=new ArrayDeque<>();
        int r=grid.length,c=grid[0].length;
        int vis[][]=new int[r][c];
        int d[][]=new int[r][c];
     
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
               
            }
        }
 
        while(!q.isEmpty())
        {
            int i=q.peek().first;
            int j=q.peek().second;
            int t=q.peek().time;
            d[i][j]=t;


            q.remove();
            lookneighbour(q,vis,grid,i-1,j,r,c,t);
            lookneighbour(q,vis,grid,i,j-1,r,c,t);
            lookneighbour(q,vis,grid,i,j+1,r,c,t);
            lookneighbour(q,vis,grid,i+1,j,r,c,t);
        }
       
        return d;
    }
    void lookneighbour(Queue<Pair> q,int[][] vis,int[][] grid,int r,int c,int m,int n,int t)
    {
        if(r<m && c<n && r>=0 && c>=0 &&  vis[r][c]==0)
        {       vis[r][c]=1;
              
                q.add(new Pair(r,c,t+1));

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