public class FindLeader {
    public static void main(String[] args) {
        var fl = new FindLeader();
        int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
        fl.findLeaders(arr);
    }
    public void findLeaders(int arr[]) {
        int n = arr.length;
        int rightMax = arr[n-1];
        System.out.println(rightMax);
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] > rightMax) {
                rightMax = arr[i];
                System.out.println(rightMax);
            }
        }
    }
}