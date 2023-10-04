public class Conditional {
    public static void main(String[] args) {
        boolean isSuperUser = true;
        boolean isUserAdmin = false;
        boolean isWifiAvl = false;

        if (isSuperUser) {
            if (isUserAdmin) {
                if (isWifiAvl) {
                    System.out.println("Access granted");
                }
                else{
                    System.out.println("No internet");
                }
            }
            else{
                System.out.println("Sorry, you are not allowed to open this");
            }
        }
        else{
            System.out.println("Sorry, you are not a super user");
        }

        // boolean isStudent = true;
        // if(isStudent){
        // System.out.println("Enter your roll no");
        // }
        // else{
        // System.out.println("enter your employee id");
        // }
    }
}
