import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args){

        double f;



        Scanner input = new Scanner(System.in);

        System.out.println("Please enter temperature in Fahrenheit: ");

        f = input.nextInt();




        double c = (( (f - 32) * 5) / 9);


        System.out.println("Temperature in Celsius is: ");


        System.out.println(c);




    }

}
