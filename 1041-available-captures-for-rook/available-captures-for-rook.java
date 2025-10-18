class Solution {
    int count = 0;

    public void recfun(int row, int col, int[][] dir, int ind, char[][] board) {
        int new_row = dir[ind][0] + row;
        int new_col = dir[ind][1] + col;

        if (new_row >= 0 && new_row < 8 && new_col >= 0 && new_col < 8) {
            if (board[new_row][new_col] == 'B') {
                return;
            } else if (board[new_row][new_col] == 'p') {
                count++;
                return;
            } else if (board[new_row][new_col] == '.') {
                recfun(new_row, new_col, dir, ind, board);
            }
        }
    }
    public int numRookCaptures(char[][] board) {
        int[][] dir = { {0,1}, {1,0}, {0,-1}, {-1,0} }; 

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    count = 0; 
                    for (int k = 0; k < 4; k++) {
                        recfun(i, j, dir, k, board);
                    }
                    return count; 
                }
            }
        }
        return 0;
    }

 } 
    