public class FloodFill {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1, 1, 0, 0},
                    {1, 2, 2, 2, 2, 0, 1, 0},
                    {2, 1, 1, 2, 2, 0, 1, 0},
                    {1, 1, 1, 2, 2, 2, 2, 0},
                    {1, 1, 1, 1, 1, 2, 1, 1},
                    {1, 1, 1, 1, 1, 2, 2, 1}};
        floodFill(a, 4, 3, 3, 2);   
        printMatrix(a);
    }

    public static void floodFill(int arr[][], int r, int c, int toFill, int prevFill) {
        int rows = arr.length;
        int cols = arr[0].length;

        if(r < 0 || r >= rows || c < 0 || c >= cols) {
            return;
        }
        if(arr[r][c] != prevFill) {
            return;
        }
        arr[r][c] = toFill;
        floodFill(arr, r-1, c, toFill, prevFill);
        floodFill(arr, r, c-1, toFill, prevFill);
        floodFill(arr, r+1, c, toFill, prevFill);
        floodFill(arr, r, c+1, toFill, prevFill);
    }

    public static void printMatrix(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println("}");
        }
    }
}