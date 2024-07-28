class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] v=new boolean[n+1];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!v[i]){
                v[i]=true;
                dfs(isConnected,v,i);
                ans++;
            }
        }
        return ans;

    }

    public void dfs(int[][] isConnected,boolean[] v,int i){
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !v[j]){
                v[j]=true;
                 dfs(isConnected,v,j);            
            }
        }
    }
    
}