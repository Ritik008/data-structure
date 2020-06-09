public class SlidingWindowMaximum {
    public static void main(String[] args) {
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
        int arr[] = {2,6,-1,2,4,1,-6,5};
        obj.slidingWindowMaximum(arr, 3);
    }
    public void slidingWindowMaximum(int arr[], int k) {
        for(int i = k; i <= arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i-k; j < i; j++) {
                max = Math.max(max, arr[j]);
            }
            System.out.print(max+" ");
        }
    }
}