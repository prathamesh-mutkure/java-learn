import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayDateConverter {

    public static void main(String[] args){

        Scanner mScanner = new Scanner(System.in);

        System.out.println("Enter the Date(1-31): ");
        int dd = mScanner.nextInt();


        //The month in programming starts from 0-11
        //so 1 should be subtracted by 1
        System.out.println("Enter the month(1-12): ");
        int mm = mScanner.nextInt() - 1;


        System.out.println("Enter the year: ");
        int yy = mScanner.nextInt();


        Date date = (new GregorianCalendar(yy, mm, dd)).getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        String day = sdf.format(date);

        System.out.println("Today is: " + day);


    }

}
