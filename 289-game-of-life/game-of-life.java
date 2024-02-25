class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Traversing the matrix to find current and next states
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int count = 0;

                // Left neighbour
                if(j-1 >= 0 && (board[i][j-1] == 1 || board[i][j-1] == -1)){
                    count++;
                }

                // Right neighbour
                if(j+1 < cols && (board[i][j+1] == 1 || board[i][j+1] == -1)){
                    count++;
                }

                // Top neighbour
                if(i-1 >= 0 && (board[i-1][j] == 1 || board[i-1][j] == -1)){
                    count++;
                }


                // Bottom neighbour
                if(i+1 < rows && (board[i+1][j] == 1 || board[i+1][j] == -1)){
                    count++;
                }

                // Left top diagnonal neighbour
                if(i-1 >=0 && j-1 >= 0 && (board[i-1][j-1] == 1 || board[i-1][j-1] == -1)){
                    count++;
                }

                // Right top diagnonal neighbour
                if(i-1 >=0 && j+1 < cols && (board[i-1][j+1] == 1 || board[i-1][j+1] == -1)){
                    count++;
                }

                // Left bottom diagnonal neighbour
                if(i+1 < rows && j-1 >= 0 && (board[i+1][j-1] == 1 || board[i+1][j-1] == -1)){
                    count++;
                }

                // Right bottom diagnonal neighbour
                if(i+1 < rows && j+1 < cols && (board[i+1][j+1] == 1 || board[i+1][j+1] == -1)){
                    count++;
                }

                // Checking according to game conditions and marking the element
                if(board[i][j] == 0 && count == 3){
                    board[i][j] = 2;    // Marking birth
                }
                if(board[i][j] == 1 && (count < 2 || count > 3)){
                    board[i][j] = -1; // Marking death
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == -1){
                    board[i][j] = 0;
                }
                else if(board[i][j] == 2){
                    board[i][j] = 1;
                }
            }
        }
    }
}