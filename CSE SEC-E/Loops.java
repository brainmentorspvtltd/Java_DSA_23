public class Loops {
    public static void main(String[] args) {
        // this is the syntax for traditional for loop
        // for(int i = 0; i < 5; i++){
        // System.out.println("This is JAVA :" + i);
        // }

        String nameArr[] = { "RAM", "SHYAM", "MOHAN" };
        // for(int i =0; i< nameArr.length; i++){
        // System.out.println(nameArr[i]);
        // }

        // this is the syntax for enhanced for loop
        // for (String name : nameArr) {
        // System.out.println("this is the name from the enhanced for loop :" + name);
        // }

        int i = 0;
        // while(i>5){
        // System.out.println("This is JAVA");
        // i+=2;
        // }

        do {
            System.out.println("This is JAVA");
            i++;
        } while (i < 5);

    }
}
