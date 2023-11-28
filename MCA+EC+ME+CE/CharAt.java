public class CharAt {
    public static void main(String[] args) {
        String name = "Shyam"; // string is nothing but an array of characters
        // S has index value of 0
        // h has index value of 1
        // y has index value of 2
        // a has index value of 3
        // m has index value of 4
        char ch1 = name.charAt(0);
        char ch2 = name.charAt(1);
        char ch3 = name.charAt(2);
        char ch4 = name.charAt(3);
        char ch5 = name.charAt(4);

        System.out.println("The char at 0 index is :" + ch1);
        System.out.println("The char at 1 index is :" + ch2);
        System.out.println("The char at 2 index is :" + ch3);
        System.out.println("The char at 3 index is :" + ch4);
        System.out.println("The char at 4 index is :" + ch5);

    }
}
