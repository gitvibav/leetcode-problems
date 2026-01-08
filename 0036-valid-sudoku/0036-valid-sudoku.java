class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    if(!seen.contains(board[i][j] + " in row " + i) &&
                       !seen.contains(board[i][j] + " in col " + j) &&
                       !seen.contains(board[i][j] + " in block " + i/3 + "-" + j/3)){
                            seen.add(board[i][j] + " in row " + i);
                            seen.add(board[i][j] + " in col " + j);
                            seen.add(board[i][j] + " in block " + i/3 + "-" + j/3);
                    }
                    else{
                        return false;
                    }
                }
            }
        }

        return true;
    }
}