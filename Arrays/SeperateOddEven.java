public class SeperateOddEven {
    public static void main(String args[]) {
        var obj = new SeperateOddEven();
        int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
        obj.seperateOddEven(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public int[] seperateOddEven(int arr[]) {
        int left = 0;
        int right = arr.length-1;
        for(int i = 0; i < arr.length; i++) {
            while(arr[left] % 2 == 0) {
                left++;
            }
            while(arr[right] % 2 != 0) {
                right--;
            }

            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
}