public class SubString {
    public static void main(String[] args) {
        String str = "aabc";
        System.out.println("All Substring of aabc are: ");
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                for(int k = i; k < j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }  
    }
}