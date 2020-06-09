public class NumberOccurOddNumberOfTime {
    public static void main(String[] args) {
        NumberOccurOddNumberOfTime oddNumbers = new NumberOccurOddNumberOfTime();
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        oddNumbers.findOddOccurences(array);
    }
    public int findOddOccurences(int arr[]) {
        int i;
        int result = 0;
        for (i = 0; i < arr.length; i++) 
        {
         result = result ^ arr[i];
         System.out.println(result);
        }
        return result;
    }
}