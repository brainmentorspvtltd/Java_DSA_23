public class Conditional {
    public static void main(String[] args) {
        boolean isTeacher = true;
        boolean isWifiAvl = false;
        boolean isSuperUser = true;

        if (isTeacher) {
            if (isSuperUser) {
                if (isWifiAvl) {
                    System.out.println("yes the internt is working");
                } else {
                    System.out.println("No internet");
                }
            } else {
                System.out.println("The user is teacher but not super user");
            }

        } else {
            System.out.println("The user is not a Teacher");
        }
    }
}
