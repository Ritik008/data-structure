public class Count1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1};
        int count = solve(arr);
        System.out.println(count);
    }
    public static int solve(int arr[]) {
        int currPointer = 0;
 
		while (currPointer < arr.length) {
			if (arr[currPointer] == 1) {
				break;
			}
			currPointer++;
		}
 
		return (arr.length - currPointer);
    }
}