public class Variable {
    public static void main(String[] args) {
        // byte age = 22;
        // byte age2 = (byte) 130;
        // System.out.println("This is the age :" + age2);

        // // float percent = 10.5f;
        // // float percent = 10.5F;
        // float percent = (float)10.5;

        // char v ='D';

        // boolean isAdmin = true;
            // boolean isWifiAvvailable =  true;

        String name = "RAM"; //6 byte add-88
        String name2 = name;// name2 also have the same add as name which is 88
        String name3 = "RAM";
        String name4 = new String("RAM");
        String name5 = name4;
        System.out.println(name == name2);//true
        System.out.println(name == name3);//true
        System.out.println(name == name4); //false
        System.out.println(name4 == name5);//true

    }
}
