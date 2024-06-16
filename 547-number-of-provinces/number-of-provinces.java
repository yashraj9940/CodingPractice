class Solution {
    public int findCircleNum(int[][] isConnected) {
        int noOfNodes = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[noOfNodes]; 
        for (int i = 0; i < noOfNodes; i++) {
            if (!visited[i]) {
                count++;
                dfs(isConnected, visited, i);
            }
        }
        return count;
    }
    
    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, visited, j);
            }
        }
    }
}
