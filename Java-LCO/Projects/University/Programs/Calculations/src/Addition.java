import java.util.Scanner;

public class Addition {

    public static void main(String[] args){

        int myFirstNumber;
        int mySecondNumber;
        int result;

//        Takes input from the user

        Scanner input = new Scanner(System.in);

//        Takes input for first number

        System.out.println("Enter Number 1");
        myFirstNumber = input.nextInt();

//        Takes input for second number

        System.out.println("Enter Number 2");
        mySecondNumber = input.nextInt();

//        Gives the answer as output

        System.out.println("Your added value is: ");

        result = myFirstNumber + mySecondNumber;

//        Gives result output

        System.out.println(result);


    }
}
