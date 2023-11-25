import java.util.ArrayList;

public class StringSubSeq {

    static ArrayList<String> findSubSeqRec(String str) {
        if (str.length() == 0) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("");
            return list1;
        }
        char singleCharacter = str.charAt(0); // r
        String remainingString = str.substring(1); // avi
        ArrayList<String> tempList = findSubSeqRec(remainingString);
        ArrayList<String> finalList = new ArrayList<>();
        for (String data : tempList) {
            finalList.add(data);
            finalList.add(singleCharacter + data);
        }
        return finalList;

    }

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
        System.out.println(findSubSeqRec("ravi"));

    }
}