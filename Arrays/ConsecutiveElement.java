import java.util.Arrays;
public class ConsecutiveElement {
    public static void main(String[] args) {
        ConsecutiveElement ce = new ConsecutiveElement();
        int array[] = {6, 7, 5, 6};
        System.out.println(ce.findConsecutive(array));
    }
    public boolean findConsecutive(int arr[]) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] + 1 != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}