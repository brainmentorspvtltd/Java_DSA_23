package Functions;

import java.util.ArrayList;

public class StringSubSeq {

    static ArrayList<String> findSubSeq(String str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char singleChar = str.charAt(i);

            if (list.size() == 0) {
                list.add("");
                list.add(singleChar + "");
                continue;
            }

            int listSize = list.size();

            for (int j = 0; j < listSize; j++) {
                String temp = list.get(j) + singleChar;
                list.add(temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findSubSeq("gaurav"));
    }
}
