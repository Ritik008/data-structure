public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int mat[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        sm.printSpiralMatrix(mat, 3, 3);        
    }

    public void printSpiralMatrix(int mat[][], int r, int c) {
        int k, l;
        k = l = 0;
        int last_col, last_row;
        last_row = r - 1;
        last_col = c - 1;
        

        while(k <= last_row && l <= last_col) {
            for(int i = l; i <= last_col; i++) {
                System.out.println(mat[k][i]);
            }
            k++;

            for(int i = k; i <= last_row; i++) {
                System.out.println(mat[i][last_col]);
            }
            last_col--;

            if(k <= last_row) {
                for(int i = last_col; i >= l; i--) {
                    System.out.println(mat[last_row][i]);
                }
                last_row--;
            }
            if(l <= last_col) {
                for(int i = last_row; i >= k; i--){ 
                    System.out.println(mat[i][l]);
                }
                l++;
            }
        }
    }
}