public class Ref {
    public static void main(String[] args) {
        int age = 22; // age has direct access to the value and it is also known as value type or
                      // primitive data type or primary data type

        // char ch = 'A';
        // String name = "age has direct access to the value and it is also known age
        // has direct access to the value and it is also known";

        String name1 = "Shubham";
        String name2 = name1;
        String name3 = "Shubham";
        String name4 = new String("shubham");

        // System.out.println(name1 == name2);
        // System.out.println(name1 == name3);
        // System.out.println(name1 == name4);

        System.out.println(name1.equals(name3));
        System.out.println(name1.equalsIgnoreCase(name4));

    }
}
