public class Loops {
    public static void main(String[] args) {
        // this is a traditional for loop
        // for(int i = 0; i<4; i++){
        // System.out.println("Hello :" + i);
        // }
        String nameArr[] = { "RAM", "SHYAM", "MOHAN" };
        // for (int i = 0; i < nameArr.length; i++) {
        // System.out.println("This is the data from array :" + nameArr[i]);
        // }
        // enhanced for loop
        // for(String name : nameArr){
        // System.out.println("This is the name from enhanced for loop :"+ name);
        // }

        // int i = 6;// loops variable init
        // while(i<5){//here we are checking the condition
        // System.out.println("Hello Java");
        // i++; //this is the loop stepping
        // }

        int i = 6;
        do {
            System.out.println("Hello Java");//in case of fasle condition the loop will still execute atleast one time
            i++;
        } while (i < 5); //here the condition is false
    }
}
