public class Variables {
    public static void main(String[] args) {
        byte age = 22; // here age is the name of the variable and byte is the data type for age
                       // variable
        byte age2 = (byte) 130;
        System.out.println(age2);
        // float percent = 10.5f;
        // float percent = 10.5F;
        float percent = (float) 10.5;

        boolean isAdmin = true;

        char a = 'B';

        String name = "Daman";
        // String name2 = "Kumar";
        String name2 = name;
        String name3 = "RAM";
        String name4 = new String("Aman");

        // System.out.println(name == name2);
        // System.out.println(name == name3);
        // System.out.println(name == name4);

        System.out.println(name4.equals(name));
        System.out.println(name4.equalsIgnoreCase(name));
        System.out.println(name.compareTo(name4));
        // name.compareTo(name4)

    }
}
