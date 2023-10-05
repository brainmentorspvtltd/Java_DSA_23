public class Loops {
    public static void main(String[] args) {
        // this is the traditional for loop syntax
        // for (int i = 0; i < 5; i+=2) {
        // System.out.println("Hello Java :" + i);
        // }
        // this is an array containing names
        String nameArr[] = { "RAM", "SHYAM", "MOHAN" };
        // for (int i = 0; i < nameArr.length; i++) {
        // System.out.println(nameArr[i]);
        // }
        // this is the syntax for enhanced for loop
        // for(String name : nameArr){
        // System.out.println(name);
        // }
        int i = 10; // while loop var init
        // while (i < 5) {// here is the condition checking
        // System.out.println("Hello Java :" + i);// here is the loop block

        // i++; // this is the stepper
        // }

        do {
            System.out.println("Hello Java :" + i);
            i++;
        } while (i < 5);
    }
}
