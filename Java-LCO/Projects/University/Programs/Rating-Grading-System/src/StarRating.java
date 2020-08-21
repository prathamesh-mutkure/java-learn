import java.util.Scanner;

public class StarRating {

    public static void main(String args[]){

        int mStar;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the star rating: ");

        mStar = in.nextInt();


        switch (mStar){

            case 5 :
                System.out.println("Amazing!");
                break;
            case 4 :
                System.out.println("Great");
                break;
            case 3 :
                System.out.println("Need Some work!");
                break;
            case 2 :
                System.out.println("Bad!");
                break;
            case 1 :
                System.out.println("Worst!");
                break;
            case 0 :
                System.out.println("No need to talk!");
                break;
            default:
                System.out.println("Please enter a star rating between 1 to 5");
                break;

        }




    }

}
