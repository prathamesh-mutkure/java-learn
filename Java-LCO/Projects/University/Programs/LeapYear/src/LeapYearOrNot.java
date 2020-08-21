import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args){

        int mYear;

        System.out.println("Enter the Year: ");

        Scanner input = new Scanner(System.in);


        mYear = input.nextInt();


        if ((mYear % 400 == 0) || (mYear % 4 == 0 && mYear % 100 != 0)){
            System.out.println(mYear + " is a Leap Year");
        }
        else {
            System.out.println(mYear + " is not a Leap Year");
        }

//        LOGIC:
//        1.  Dividing by 400, No Remainder -LEAP
//        2.1 Dividing by 4, No Remainder -LEAP
//        2.2 Dividing by 100, Remainder -LEAP

    }

}