import java.util.Scanner;

public class Test {

    private static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args){

       float x = 1, y = 1, z = 1;
       float a1, b1, c1, d1;
       float a2, b2, c2, d2;
       float a3, b3, c3, d3;

       a1 = scanner.nextInt();
       a2 = scanner.nextInt();
       a3 = scanner.nextInt();
       b1 = scanner.nextInt();
       b2 = scanner.nextInt();
       b3 = scanner.nextInt();
       c1 = scanner.nextInt();
       c2 = scanner.nextInt();
       c3 = scanner.nextInt();
       d1 = scanner.nextInt();
       d2 = scanner.nextInt();
       d3 = scanner.nextInt();

       for (int i = 0; i < 3; i++){

           if (i == 1){
               System.out.println("1st Iteration: ");

               y = 0;
               z = 0;
               x(y, z, a1, b1, c1, d1);

               z = 0;
               y(x, z, a2, b2, c2, d2);

               z(x, y, a3, b3, c3, d3);
           }
           else {
               System.out.println("\nSecond Iteration: ");

               x(y, z, a1, b1, c1, d1);

               y(x, z, a2, b2, c2, d2);

               z(x, y, a3, b3, c3, d3);
           }

       }

//       System.out.println("1st Iteration: ");
//
//       y = 0;
//       z = 0;
//       x(x, y, z, a1, b1, c1, d1);
//
//       z = 0;
//       y(x, y, z, a2, b2, c2, d2);
//
//       z(x, y, z, a3, b3, c3, d3);

//       System.out.println("\n\nSecond Iteration: ");
//
//       x(x, y, z, a1, b1, c1, d1);
//
//       y(x, y, z, a2, b2, c2, d2);
//
//       z(x, y, z, a3, b3, c3, d3);
//
//       System.out.println("\n\nThird Iteration: ");
//
//       x(x, y, z, a1, b1, c1, d1);
//
//       y(x, y, z, a2, b2, c2, d2);
//
//       z(x, y, z, a3, b3, c3, d3);
   }

   private static void x(float y, float z, float a1, float b1, float c1, float d1){
       float x = (1/a1)*(d1 - (b1*y) - (c1*z));
       System.out.print("X = " + x);
   }

   private static void y(float x, float z, float a2, float b2, float c2, float d2){
       float y = (1/b2)*(d2 - (a2*x) - (c2*z));
       System.out.print("\tY = " + y);
   }

   private static void z(float x, float y, float a3, float b3, float c3, float d3){
       float z = (1/c3)*(d3 - (a3*x) - (b3*y));
       System.out.print("\tZ = " + z);
   }

}
