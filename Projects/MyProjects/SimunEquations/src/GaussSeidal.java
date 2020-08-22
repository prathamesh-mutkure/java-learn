import java.util.Scanner;

public class GaussSeidal {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

//        float X, Y, Z;

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

        logic(x, y, z, a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3);

    }

    public static void logic(float x, float y, float z, float a1, float a2, float a3, float b1, float b2, float b3, float c1, float c2, float c3, float d1, float d2, float d3){

        for (int i = 0; i < 3; i++){

            if (i == 1){
                firstIteration(x, y, z, a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3);
            }
            if (i == 2){

            }
        }
    }



    public static void firstIteration(float x, float y, float z, float a1, float a2, float a3, float b1, float b2, float b3, float c1, float c2, float c3, float d1, float d2, float d3){

        System.out.println("1st Iteration:");

        y = 0;
        z = 0;
        x = (1/a1)*(d1 - (b1*y) - (c1*z));
        System.out.print("X = " + x);

        x = 0;
        z = 0;
        y = (1/b2)*(d2 - (a2*x) - (c2*z));
        System.out.print("\tY = " + y);

        x = 0;
        y = 0;
        z = (1/c3)*(d3 - (a3*x) - (b3*y));
        System.out.print("\tZ = " + z);
    }


    public static void secondIteration(float x, float y, float z, float a1, float a2, float a3, float b1, float b2, float b3, float c1, float c2, float c3, float d1, float d2, float d3){



    }

}
