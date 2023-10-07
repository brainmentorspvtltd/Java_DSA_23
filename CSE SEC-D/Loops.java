public class Loops {
    public static void main(String[] args) {
        // 0 is the starting point of this loop and 4 is the ending point of this same
        // loop. It means this loop will be executed 5 times.

        // this is traditional for loop syntax
        // for (int i = 0; i < 5; i+=2) {
        // System.out.println("Hello Java :" + i);
        // }

        // String nameArr[] = {"RAM", "SHYAM", "MOHAN", "NIKHIL"};
        // this is the syntax for enhanced for loop
        // for(String name : nameArr){
        // System.out.println(name);
        // }

        // int i = 0;
        // while (i < 5) {
        // System.out.println("Hello Java :" + i);
        // i++;
        // }

        int i = 10;
        do {
            System.out.println("Hello Java :" + i);
            i++;
        } while (i < 5);

    }
}
