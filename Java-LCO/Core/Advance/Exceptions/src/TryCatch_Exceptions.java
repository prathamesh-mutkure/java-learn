public class TryCatch_Exceptions {

//    EXCEPTION:
//    Crashes the whole program
//    Even the code after the Exception, breaks
//    TO PREVENT IT, WE USE TRY-CATCH

    public static void main(String[] args){

        try {
            int catchArray[] = {1, 2, 3, 4, 5};
            System.out.println(catchArray[5]);
        } catch (ArrayIndexOutOfBoundsException mException){
            System.out.println("\nCHECK EXCEPTION: " + mException);
        }

        System.out.println("\nI am out of catch");


//        TRY-CATCH
//        Just like if and else statements
//        Prevent the whole program from crashing

    }

}
