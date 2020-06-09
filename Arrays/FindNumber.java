public class FindNumber {
    public static void main(String[] args) {
        FindNumber fn = new FindNumber();
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(fn.findNumberInSortedArray(arr));
    }

    public int findNumber(int nums[]) {
        int start = 0, end = nums.length-1;   
        int find = 0, mid = 0;

        while(start <= end) {
            mid = (start + end) / 2;
            if(start == end) {
                find = mid + 1;
                break;
            }else if(nums[mid] == mid+1) {
                start = mid + 1;
            }else if(nums[mid] > mid + 1) {
                end = mid - 1;
            }
        }
        return find;
    }
}