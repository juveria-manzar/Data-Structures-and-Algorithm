public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char temp=board[i][j];
                    board[i][j]='.';
                    boolean smans=isValid(board,i,j,temp);
                    board[i][j]=temp;
                    
                    if(smans==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    
    public static boolean isValid(char[][]board,int i,int j,char d){
    
    //row check
    for(int c=0;c<9;c++){
        if(board[i][c]==d){
            return false;
        }
    }
    
    //col check
    for(int r=0;r<9;r++){
        if(board[r][j]==d){
            return false;
        }
    }
    
    //submatrix check
    int subRowStrt=(i/3)*3;
    int subColStrt=(j/3)*3;
    for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
            if(board[subRowStrt+r][subColStrt+c]==d){
                return false;
            }
        }
    }
    return true;
  }
    public static void main(String[] args) {
        
    }
}
