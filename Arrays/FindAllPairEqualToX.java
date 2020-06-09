import java.util.Arrays;
public class FindAllPairEqualToX {
    public static void main(String[] args) {
        var pairs = new FindAllPairEqualToX();
        int array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
        pairs.findAllPairs(array, 15);        
    }

    public void findAllPairs(int arr[], int x) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        Arrays.sort(arr);
        while(l < r) {
            int tempSum = arr[l] + arr[r];
            if(tempSum == x) {
                System.out.format("The pairs of integer equals to %d is %d and %d\n",x,arr[l],arr[r]);
                r--;
                l++;
            }else if(tempSum > x) {
                r--;
            }else {
                l++;
            }
        }
    }
}