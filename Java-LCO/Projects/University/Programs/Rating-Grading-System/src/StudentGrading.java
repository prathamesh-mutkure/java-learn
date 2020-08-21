import java.util.Scanner;

public class StudentGrading {

    public static void main(String args[]){

        char grade;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Grade from A-F: ");

        grade = input.next().charAt(0);



        switch (grade){

            case 'A' :
                System.out.println("Outstanding! Keep it UP.");
                break;
            case 'B' :
                System.out.println("Excellent! Keep Going.");
                break;
            case 'C' :
                System.out.println("Good But not Great!");
                break;
            case 'D' :
                System.out.println("Can do Better!");
                break;
            case 'E' :
                System.out.println("Need to work Hard!");
                break;
            case 'F' :
                System.out.println("Failed! ");
                break;
            default:
                System.out.println("Please Enter a Grade Between A-F");
                break;


        }


    }

}