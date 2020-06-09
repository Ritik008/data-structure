public class StringRotation {
    public static void main(String[] args) {
        StringRotation sr = new StringRotation();
        System.out.println(sr.isRotation("java2blog", "blogjava2"));
    }

    public boolean isRotation(String str, String rotation) {
        String str2 = str + str;
        if(str2.contains(rotation)) {
            return true;
        }else {
            return false;
        }
    }
}