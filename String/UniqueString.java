import java.util.Arrays;
public class UniqueString {
    public static void main(String[] args) {
        UniqueString us = new UniqueString();
        System.out.println(us.hasAllUniqueString("java2blog"));        
        System.out.println(us.hasAllUniqueString("apple"));        
        System.out.println(us.hasAllUniqueString("index"));        
        System.out.println(us.hasAllUniqueString("world")); 


        System.out.println("==========================");
        System.out.println(us.uniqueString("java2blog"));              
        System.out.println(us.uniqueString("apple"));              
        System.out.println(us.uniqueString("index"));              
        System.out.println(us.uniqueString("world"));              
    }

    public boolean hasAllUniqueString(String word) {
        char charArray[] = word.toCharArray();
        Arrays.sort(charArray);
        for(int i = 0; i < charArray.length-1; i++) {
            if(charArray[i] == charArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    public boolean uniqueString(String word) {
        boolean charMap[] = new boolean[26];
        for(int index = 0; index < word.length(); index++) {
            int asciiCode = (int)word.toUpperCase().charAt(index)-64;

            if(charMap[asciiCode] == false) {
                charMap[asciiCode] = true;
            }else {
                return false;
            }
        }
        return true;
    }
}