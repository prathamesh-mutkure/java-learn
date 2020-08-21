import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args){


        int mFirstNumber;
        int mSecondNumber;


//        Takes Input
        Scanner input = new Scanner(System.in);


        System.out.println("Enter First Number");
        mFirstNumber = input.nextInt();


        System.out.println("Enter Second Number");
        mSecondNumber = input.nextInt();



        if (mFirstNumber > mSecondNumber){
            System.out.println("The first number is Greater than the second number");
        }
        if (mFirstNumber < mSecondNumber){
            System.out.println("The second number is Greater than the first number");
        }
        if (mFirstNumber == mSecondNumber){
            System.out.println("Both Numbers are equal");
        }



    }

}
