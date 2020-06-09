import java.util.Arrays;
public class AnagramString {
    public static void main(String[] args) {
        AnagramString as = new AnagramString();
        System.out.println(as.checkAnagram("this is Silent", "this is Listen"));
    }

    public boolean checkAnagram(String word, String anagram) {
        word = word.replace(" ","");
        anagram = anagram.replace(" ","");
        
        word = word.toLowerCase();
        anagram = anagram.toLowerCase();

        char[] wordArray = word.toCharArray();
        char[] anagramArray = anagram.toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);
        
        return Arrays.equals(wordArray, anagramArray);
    }

}