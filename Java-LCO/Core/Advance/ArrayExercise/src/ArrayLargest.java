public class ArrayLargest {

//    FIND THE LARGEST

    public static void main(String args[]){

        int[] mExercise = {1, 6, 3, 7, 4, 0, 17,87, 26, 4, 56, 8};

        int mLargest = mExercise[0];

        for (int i = 1; i < mExercise.length; i++){

            if (mExercise[i] > mLargest){
                mLargest = mExercise[i];
            }

        }

        System.out.println("The Largest Number is " + mLargest);

    }

}