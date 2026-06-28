class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet set = new HashSet();
            int count=0;
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    set.add(board[i][j]);
                    count++;
                }
            }
            if(set.size()!=count) return false;
        }
        
        for(int i=0;i<9;i++){
            HashSet set = new HashSet();
            int count=0;
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    set.add(board[j][i]);
                    count++;
                }
            }
            if(set.size()!=count) return false;
        }
        
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet set = new HashSet();
                int count=0;
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        if(board[r][c]!='.'){
                            set.add(board[r][c]);
                            count++;
                        }
                    }
                }
                if(set.size()!=count) return false;
            }
        }
        return true;
    }
}
