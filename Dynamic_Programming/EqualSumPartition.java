public class EqualSumPartition {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        EqualSumPartition obj = new EqualSumPartition();
        System.out.println(obj.canPartition(arr, arr.length));
    }

    public boolean canPartition(int arr[], int n) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum % 2 != 0) return false;

        return canPartitionRecursive(arr, sum/2, 0);
    }

    public boolean canPartitionRecursive(int[] num, int sum, int currentIndex) {
        System.out.println(sum);
        if(sum == 0) {
            return true;
        }
        if(num.length == 0 || currentIndex >= num.length) {
            return false;
        }

        if(num[currentIndex] <= sum) {
            if(canPartitionRecursive(num, sum - num[currentIndex], currentIndex + 1)) {
                return true;
            }
        }
        return canPartitionRecursive(num, sum, currentIndex+1);
    }
}