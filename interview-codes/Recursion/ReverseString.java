public class ReverseString {

    static String rev="";
    static String revStr(String str, int index){
        if(index<=-1){
            return rev;
        }
        char a = str.charAt(index);
        rev += a;
        return revStr(str, index-1);
    }
    public static void main(String[] args) {
        String str ="hello";
        int n = str.length();
        System.out.println(revStr(str, n-1));
    }
}
