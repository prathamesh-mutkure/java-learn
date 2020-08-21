public class ListEvenNumbers {

    public static void main(String[] args){

//      Print all Even Numbers from 2-200

//      METHOD 1:
//        for (int mEvenNo = 2; mEvenNo <= 200; mEvenNo = mEvenNo + 2){
//            System.out.println(mEvenNo);
//        }



//        METHOD 2:
        for (int mEvenNo = 1; mEvenNo <= 200; mEvenNo++){
//            System.out.println("The Number is " + mEvenNo);


            if ((mEvenNo % 2) == 0){
                System.out.println("The Number is " + mEvenNo);
            }

        }

//        To do the SAME FOR ODD numbers change '==' to '!=' in the above 'if' statement


    }

}
