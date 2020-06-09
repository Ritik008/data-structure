public class CountFrequency {
    public static void main(String[] args) {
        CountFrequency cf = new CountFrequency();
        int array[] = {4,3,2,2,3,4,4,5,10, 40};
        cf.countFrequency(array);
        cf.countFrequencyBruteForce(array);
    }
    public void countFrequency(int arr[]) {
        int n = arr.length;
        int freqArr[] = new int[9999];
        for(int i = 0; i < n; i++) {
            freqArr[arr[i]]++;
        }
        for(int i = 0; i < freqArr.length; i++) {
            if(freqArr[i] != 0) {
                System.out.println(i+" -> "+freqArr[i]+" ");
            }
        }
    }
    public void countFrequencyBruteForce(int arr[]) {
        int n = arr.length;
        int freqArr[] = new int[n];
        int count;
        for(int i=0; i<freqArr.length; i++){
            freqArr[i] = -1;
        }
        for(int i = 0; i < n; i++) {
            count = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    freqArr[j] = 0;
                }
            }
            if(freqArr[i] != 0) {
                freqArr[i] = count;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(freqArr[i]+" ");
        }
    }
}