import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args){

        int myFirstNumber;
        int mySecondNumber;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        myFirstNumber = input.nextInt();

        System.out.println("Enter your Second number");
        mySecondNumber = input.nextInt();

        System.out.println("The answer is: ");

        result = myFirstNumber * mySecondNumber;

        System.out.println(result);

    }

}

