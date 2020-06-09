import java.util.Arrays;
public class TargetSumSubarr {
    public static void main(String[] args) {
        TargetSumSubarr tss = new TargetSumSubarr();
        int array[] = {2, 3, 6, 4, 9, 0, 11};
        // tss.targetSumSubarrByBruteForce(array, 9);
        tss.targetSumSubarr(array, 9);
    }
    public void targetSumSubarrByBruteForce(int arr[], int k) {
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    public void targetSumSubarr(int arr[], int k) {
        Arrays.sort(arr);
        int sum = 0;
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            sum += arr[start] + arr[end];
            if(arr[start] == k) {
                System.out.println(arr[start]+" "+arr[start]);
            }else if(arr[end] == k) {
                System.out.println(arr[end]+" "+arr[end]);
            }
            if(sum == k) {
                System.out.println(arr[start]+" "+arr[end]);
                end--;
                start++;
                sum = 0;
            }else if(sum > k) {
                end--;
                sum = 0;
            }else {
                start++;
                sum = 0;
            }
        }
    }
}