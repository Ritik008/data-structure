import java.util.*;
public class PerfectSubarray {
    public static void main(String[] args) {
        int arr[] = {30, 30, 9, 1, 30};
        int arr2[] = {3, 4, 3, -3, 5, 2, -7};
        System.out.println(subArray(arr));
        System.out.println(subArrayWithNegative(arr2));
    }

    public static int subArray(int arr[]) {
        int count = 0, sum = 0, min_sum = 0;
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(0, 1);
        for(int a: arr) {
            sum += a;
            int j = 0, val = 0;
            if(map.containsKey(sum)) {
                map.put(val, map.get(val) + 1);
            }
            while(val >= 0) {
                val = sum - (j * j);
                if(map.containsKey(val)) {
                    count += map.get(val);
                }
                j++;
            }
           
            map.put(sum, 1);
        }
        System.out.println(map);
        return count;
    }

    public static int subArrayWithNegative(int arr[]) {
        int count = 0, sum = 0, min_sum = 0;
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(0, 1);
        for(int a: arr) {
            sum += a;
            min_sum = Math.min(min_sum, sum);
            int j = 0, val = 0;
            if(map.containsKey(sum)) {
                map.put(val, map.get(val) + 1);
            }
            while(val >= min_sum) {
                val = sum - (j * j);
                if(map.containsKey(val)) {
                    count += map.get(val);
                }
                j++;
            }
           
            map.put(sum, 1);
        }
        System.out.println(map);
        return count;


    }
}