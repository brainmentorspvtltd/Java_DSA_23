public class Conditional {
    public static void main(String[] args) {
        // int age = 18;
        // if (age >= 18) {
        //     System.out.println("you can vote");
        // } else if (age != 18) {
        //     System.out.println("You are not eligible to vote");
        // }

        boolean isSuperUser = true;
        boolean isWifiAvl = false;
        boolean isUserAdmin = true;
        boolean isCustomer = true;


        if(isSuperUser){
            if(isUserAdmin){
                if(isWifiAvl){
                    System.out.println("Yes you are the superuser as well as the admin");
                }
                else{
                    System.out.println("Internet not avl");
                }
            }
            else{
                System.out.println("Sorry, you are not an admin");
            }
        }
        else{
            System.out.println("Sorry, you are not a super user");
        }
    }
}