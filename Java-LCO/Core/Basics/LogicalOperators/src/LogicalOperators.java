public class LogicalOperators {

    public static void main(String[] args){

        // Examples for Assigning LCO courses

        boolean fbLogin = true;
        boolean googleLogin = false;
        boolean hasPaid = false;


//        && - returns TRUE if ALL conditions are TRUE
        System.out.println(fbLogin && googleLogin && hasPaid);  //false


//        || - returns TRUE if ANY ONE condition is TRUE
        System.out.println(fbLogin || googleLogin || hasPaid);  //true


//        ! - reverses the condition
        System.out.println(!hasPaid); //true


    }

}
