public class IfElse {

    public static void main(String[] args){

        System.out.println("CONDITION 1: ");



        int temp = 35;

//        Use of If-Else depends upon our work
//        We can use If-Else of any of the Three conditions


//      If 'if' condition is TRUE then sout of 'if' will work
//      Otherwise the sout of 'else' works
        if (temp < 30){
            System.out.println("The temp is less than 30");
            System.out.println("Its COOL");
        } else {
            System.out.println("The temp is more than 30");
            System.out.println("Its HOT");
        }


        System.out.println("CONDITION 2: ");



//      There can be multiple sout in 'if'
//      The appropriate 'if' will work
//      Or the 'else' will work
        int temp2 = 45;

        if (temp2 < 30){
            System.out.println("The temp is less than 30");
            System.out.println("Its COOL");
        } if (temp2 < 40){
            System.out.println("The temp is less than 40");
            System.out.println("Its MODERATE");
        } else {
            System.out.println("The temp is VERY HOT");
        }



        System.out.println("CONDITION 3.1: ");


//        We can Use && and || in If-Else conditions
//        Or we can use All the conditions of our LOGICAL STUFF
        if (temp < 30 && temp < 40){
            System.out.println("Its COOL");
        } else {
            System.out.println("Its HOT");
        }

        System.out.println("CONDITION 3.2: ");

        if (temp < 30 || temp < 40){
            System.out.println("Its MODERATE");
        } else {
            System.out.println("Its very hot");
        }

//        FORMAT:
//
//        if (Condition: should be true){
//            System.out.println("xyz");
//        } else {
//            System.out.println("xyz");
//        }




    }

}
