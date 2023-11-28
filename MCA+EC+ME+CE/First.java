public class First {
    public static void main(String[] deepanshu) {
        // int sum = 0;// here sum is the name of the variable and int is the datatype for variable sum
        // for (int a = 0; a < deepanshu.length; a++) {

        //     String deep = deepanshu[3];
        //     sum = sum + Integer.parseInt(deep);
        //     sum += Integer.parseInt(deep);
        // }

        // System.out.println("This is sum of CMD line args :" + sum);
        int num1 = Integer.parseInt(deepanshu[0]);
        int num2 = Integer.parseInt(deepanshu[1]);
        int sum = num1 + num2;
        System.out.println("This is the sum of cmd line args :" + sum);
        num1 = Integer.parseInt(null);

    }
}
