public class Seperate0sAnd1s {
    public static void main(String[] args) {
        Seperate0sAnd1s obj = new Seperate0sAnd1s();
        int arr[]={0,1,0,0,1,1,1,0,1};
        obj.sepeate0sand1s(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");    
        }
    }
    public static int[] sepeate0sand1s(int arr[]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        for(int i = 0; i < count; i++) {
            arr[i] = 0;
        } 

        for(int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }
}