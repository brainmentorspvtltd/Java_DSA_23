// what is public
// public is a scope.

// JRE is installed in some other drive than the drive in which i am writing the code.

// to complile code into byte code we have a command 
// javac <JavaSourceFileName.java>

// to generate machine code from byte we have a command java <ByteCodeFileName>
public class FirstDemo {
    // static things are those which gets loaded first into the memory during class loaad.
    // main method is the entry point of every java program. Its presence is important when JRE is executing the code.
    // void does not return anything, when JRE calls this main method it does not return anything
    // main is the name of the method
    // String [] args are the command line arguments
    public static void main(String[] args) {
        System.out.println("this is the main that JRE knows");
        // main();
    }
    // overloaded methods - methods having same name buy different signature(param list)
    //user defined overloaded main method
    // public static void main(){
    //     System.out.println("this is the user defined main method");
    // }
}
