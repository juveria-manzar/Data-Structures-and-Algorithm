public class Floodfill1 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0 }, { 1, 0, 0, 1, 1, 0, 1, 1 },
                { 1, 2, 2, 2, 2, 0, 1, 0 }, { 1, 1, 1, 2, 2, 0, 1, 0 }, { 1, 1, 1, 2, 2, 2, 2, 0 },
                { 1, 1, 1, 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1, 2, 2, 1 } };

        print(matrix);
        floodFill(matrix,0,0,3,1);
        System.out.println();
        print(matrix);
    }

    public static void floodFill(int[][] a, int r,int c, int toFill, int prevFill) {
        int rows=a.length;
        int cols=a[0].length;

        if(r<0||r>=rows||c<0||c>=cols){
            return;
        }

        if(a[r][c]!=prevFill){
            return;
        }

        a[r][c]=toFill;

        floodFill(a, r-1, c, toFill, prevFill);
        floodFill(a, r, c+1, toFill, prevFill);
        floodFill(a, r, c-1, toFill, prevFill);
        floodFill(a, r+1, c, toFill, prevFill);
    }

    public static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
