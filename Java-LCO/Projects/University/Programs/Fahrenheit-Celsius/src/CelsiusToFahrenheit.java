import java.util.Scanner;

public class CelsiusToFahrenheit {


    public static void main(String[] args){


        float mC;


        Scanner input = new Scanner(System.in);


        System.out.println("Please enter temperature in Celsius");


        mC = input.nextInt();


        System.out.println("Temperature in Fahrenheit is: ");


        float mF = (((mC * 9) / 5) + 32);


        System.out.println(mF);





    }


}
