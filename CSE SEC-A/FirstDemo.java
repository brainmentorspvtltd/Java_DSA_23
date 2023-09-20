//This is PascleCase
//This is camelCase
//This is snake_case

// to compile code run javac <JavaSourceCodeFileName.java>
//to generate machine code from byte code we have a command java <ByteCodeFileName>

// double slash is used to write comments.
//comments are non executable lines that compiler ignores during code compilation.

/*
 * we can use /* to write multi-line comments.
 */

//if the scope of the class is public then the name of the class and the file name must be same


public class FirstDemo {
    // main is the entry point of every program.
    public static void main(String[] args) {

        int sum = 0;
        // the loop starts from 0 and goes upto the lenght of the args array lenght.
        // with each iteration we update the value of the variable sum with the values
        // recieved from the args array
        for (int a = 0; a < args.length; a++) {
            // here we are parsing String value from the command line arguments into int
            // types
            sum = sum + Integer.parseInt(args[a]);
        }

        // once we have the result stored in the sum variable we use println to print
        // the output to the consloe screen of the vs code compiler
        System.out.println("This is the sum of CMD line args " + sum);

        // int num1 = Integer.parseInt(args[0]);
        // int num2 = Integer.parseInt(args[1]);

        // int result = num1 + num2;

        // System.out.println("This is the sum of the CMD line args " + result);

        // System.out.println("This is the JRE main");
    }
    //The question here we have is if we can have more than one main or not.
    // In java we can have more than one main method, but their signatures(parameter
    // list) must be different.
    // public static void main() {
    // System.out.println("This is the user main");
    // }
}
