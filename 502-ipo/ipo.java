import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        
        // Step 1: Combine capital and profits into a 2D array for easy sorting
        int[][] projects = new int[n][2];
        for (int i = 0; i < n; i++) {
            projects[i][0] = capital[i]; // Capital requirement
            projects[i][1] = profits[i]; // Profit
        }
        
        // Step 2: Sort projects by their capital requirements in ascending order
        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Step 3: Max-heap to store the profits of affordable projects
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        int i = 0;
        // Step 4: Perform at most 'k' projects
        for (int j = 0; j < k; j++) {
            // Add all projects we can afford with our current capital 'w' into the max-heap
            while (i < n && projects[i][0] <= w) {
                maxHeap.add(projects[i][1]);
                i++;
            }
            
            // If we can't afford any more projects, break out early
            if (maxHeap.isEmpty()) {
                break;
            }
            
            // Greedily pick the project with the maximum profit available
            w += maxHeap.poll();
        }
        
        return w;
    }
}