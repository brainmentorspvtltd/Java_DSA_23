public class CommandLineArgs {
    public static void main(String[] args) {

        int sum = 0;
        for(int a = 0; a<args.length; a++){
            sum = sum + Integer.parseInt(args[a]);
        }
        System.out.println("this is the sum of the args :" + sum);
        // int num1 = Integer.parseInt(args[0]);
        // int num2 = Integer.parseInt(args[1]);
        // int sum = num1 + num2;
        // System.out.println("this is the sum from CMD args " + sum);

       

    }
}
