public class ArrayAddition {

    public static void main(String args[]){

        int[] mExercise = {1, 6, 3, 7, 4, 0, 17,87, 26, 4, 56, 8};

        int sum = 0;


        for (int i = 0; i < mExercise.length; i++){

            sum = sum + mExercise[i];
//          OR sum += mExercise[i];

        }

        System.out.println("The Sum is " + sum);

    }

}