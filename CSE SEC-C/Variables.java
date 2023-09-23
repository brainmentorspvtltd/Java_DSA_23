public class Variables {
    public static void main(String[] args) {
        int age = 22; // here age is the name of the variable and int is the data type of variable age

        byte age2 = 22;
        byte age3 = (byte) 130;
        short a = 55;
        // float percent = 10.5f;
        // float percent = 10.5F;
        float percent = (float) 10.5;

        boolean b = false;

        char w = 'b';

        // System.out.println(age3);


        String name = "Dam";
        String name2 = name;
        // System.out.println(name == name2);
        String name3 = "Ram";
        // System.out.println(name == name3);
        String name4 = new String("Aman");
        // System.out.println(name == name4);

        System.out.println(name4.equals(name)); // when we use equals the value is compared and when we use == the reference is compared

        // equals is case-sensitive

        //equalsIgnoreCase ignores the case in the values being compared

        System.out.println(name.equalsIgnoreCase(name4));


        // there is another String function that is used to compare 2 String values
        System.out.println(name4.compareTo(name));
    }

    // boolean s = 0;

    boolean s = true;
}
