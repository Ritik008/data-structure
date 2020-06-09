public class ReverseString {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("Ritika"));
    }

    public String reverseString(String str) {
        String revStr = "";
        for(int i = str.length()-1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }
}