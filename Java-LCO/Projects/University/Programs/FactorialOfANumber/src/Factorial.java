import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int mNumber;
        int mFactorial = 1;

        System.out.println("Please enter a number for Factorial: ");
        mNumber = input.nextInt();

        if (mNumber > 0){

            for (int mNo = mNumber; mNo > 0; mNo = mNo - 1){
                mFactorial = mFactorial * mNo;
            }
            System.out.println("The factorial of number " + mNumber + " is " + mFactorial);
        }
        else {
            System.out.println("Please Enter a Positive Number");
        }

    }

}
