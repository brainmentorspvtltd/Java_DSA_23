package Recursion;

public class VowelAndConsonants {

    static void findVowelAndConsonants(String name) {
        name = name.toLowerCase();
        if (name.length() == 0) {
            return;
        }
        char singleChar = name.charAt(0);
        if (singleChar == 'a' || singleChar == 'e' || singleChar == 'i' || singleChar == 'o' || singleChar == 'u') {
            System.out.println(singleChar + " is a Vowel");
        } else {
            System.out.println(singleChar + " is a Consonant");
        }
        findVowelAndConsonants(name.substring(1));
    }

    public static void main(String[] args) {

    }
}
