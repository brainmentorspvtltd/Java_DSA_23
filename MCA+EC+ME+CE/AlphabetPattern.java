public class AlphabetPattern {
    public static void main(String[] args) {
        int alphabet = 65;
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            // alphabet++;
            ch++;
        }
    }
}
