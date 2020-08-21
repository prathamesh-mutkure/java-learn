import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args){


        int mNo1;
        int mNo2;
        int mNo3;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number");
        mNo1 = input.nextInt();

        System.out.println("Enter Second Number");
        mNo2 = input.nextInt();

        System.out.println("Enter Third Number");
        mNo3 = input.nextInt();



        if (mNo1 > ((mNo2 + mNo3) / 2)){
//   OR if ((mNo1 > mNo2) && (mNo1 > mNo3))
            System.out.println(mNo1 + " is the Greater than " + mNo2 + " and " + mNo3);
        }


        if (mNo2 > ((mNo1 + mNo3) / 2)){
//   OR if ((mNo2 > mNo1) && (mNo2 > mNo3))
            System.out.println(mNo2 + " is the Greater than " + mNo1 + " and " + mNo3);
        }

        if (mNo3 > ((mNo2 + mNo1) / 2)){
//   OR if ((mNo3 > mNo2) && (mNo3 > mNo1))
            System.out.println(mNo3 + " is the Greater than " + mNo2 + " and " + mNo1);
        }
        if (mNo1 == mNo2 && mNo1 == mNo3){
            System.out.println("All the Numbers are equal");
        }
        else {
            System.out.println("Please Enter Three Distinct Numbers");
        }



    }

}
