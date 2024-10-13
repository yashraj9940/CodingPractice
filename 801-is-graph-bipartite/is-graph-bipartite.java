class Solution {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int[] color = new int[V];
        for(int i = 0; i < V;i++) color[i] = -1; 
        for(int i = 0; i < V;i++){
            if(color[i] == -1){
                if(!check(i , V , graph , color)) return false;
            }
        }
        return true;
    }
    static boolean check(int start , int V , int[][] adj , int[] color){
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(start);
            color[start] = 0;
            while(!queue.isEmpty()){
            int poped = queue.poll();
            int currColor = color[poped];
            for(int element : adj[poped]){
                int x = color[element];
                if(x == -1){
                    color[element] = 1-currColor;
                    queue.add(element);
                }
                else if(x == currColor) return false;
            }
        }
        return true;
    }
}