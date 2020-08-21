public class Calculations {

    public static void main(String[] args){

//        In some conditions we don't get data from internet so we should put a if/else code
//        or a null value

        int number1 = 10;
        int number2 = 20;

        int number3 = 50;

//        Here '+=' ADDS NUMBER3 and NUMBER1
//        Or '+=' ADDS the value BEFORE IT with the value AFTER IT
//        SAME AS number3 = number3 + number1
//        Also applicable to other signs

        number3 += number1;

        System.out.println(number3);

//      Try to use as many as parentheses to avoid confusion and better results

        System.out.println( ((7+7)-10)*(3/6) );




    }

}