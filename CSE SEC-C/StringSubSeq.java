import java.util.ArrayList;

public class StringSubSeq {

    static ArrayList<String> findSubSeq(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char singleCharacter = str.charAt(i);
            if (list.size() == 0) {
                list.add("");
                list.add("" + singleCharacter);
                continue;
            }

            int listSize = list.size();
            for (int j = 0; j < listSize; j++) {
                String temp = list.get(j) + singleCharacter;
                if (!list.contains(temp)) {
                    list.add(temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findSubSeq("ravi"));
    }
}
