public class ConditionalStatements {
    public static void main(String[] args) {
        int a = 5;
        boolean isAdmin = true;
        boolean isWiFiAvl = false;
        boolean isSuperUser = true;
        boolean isNormalUser = true;

        if (isSuperUser) {
            if (isAdmin) {
                if (isWiFiAvl) {
                    System.out.println("Yes, Wifi avl");
                }
                else{
                    System.out.println("the wifi is not avl");
                }
                System.out.println("Yes the user is Admin");
            }
            else {
                System.out.println("the user is not an Admin");
            }
            System.out.println("yes the user is Super User");
        }

        else if (isNormalUser) {
            System.out.println("yes the user is normal user");
        }

        // if(a%2==0){
        // System.out.println("THis is even");
        // }
        // else{
        // System.out.println("this is odd");
        // }

    }
}
