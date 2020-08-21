import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args){

        int myFirstNo;
        int mySecondNo;
        int result;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        myFirstNo = input.nextInt();

        System.out.println("Enter Second Number");
        mySecondNo = input.nextInt();

        System.out.println("Your answer is: ");

        result = myFirstNo - mySecondNo;

        System.out.println(result);
    }


}
