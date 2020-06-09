public class FindPairClosedToX {
    public static void main(String[] args) {
        int array[] = {-40, -5, 1, 3, 6, 7, 8, 20};
        findPairClosedToX(array, 5);
    }
    public static void findPairClosedToX(int arr[], int x) {
        int n  = arr.length;
        int l = 0;
        int r = n - 1;
        int pairOne = l;
        int pairTwo = n - 1;
        int minimumDiff = Integer.MAX_VALUE;

        while(l < r) {
            int tempSum = arr[l] + arr[r] - x;
            System.out.println("--------------");
            System.out.println(tempSum);
            if(Math.abs(tempSum) < Math.abs(minimumDiff)) {
                System.out.println("--------------");
                minimumDiff = tempSum;
                System.out.println(minimumDiff);
                pairOne = l;
                pairTwo = r;
            }
            if(tempSum > x) {
                r--;
            }else {
                l++;
            }
        }
        System.out.format("The pair whose sum is closest to %d is %d and %d", x, arr[pairOne], arr[pairTwo]);
    }
}