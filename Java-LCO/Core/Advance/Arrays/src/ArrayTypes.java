public class ArrayTypes {

    public static void main(String args[]){

//        ARRAY:
//        USED to STORE MULTIPLE VARIABLES in ONE line of CODE
//        NEEDS []

//        Primitive Integer

        int score = 40;

        System.out.println(score);


//        ARRAY TYPE 1:
//        EASY ONE

        int[] scoreArray = {1, 2, 3, 4, 5};

        System.out.println(scoreArray[0]);


//        ARRAY TYPE 2:
//        COMPLEX ONE

        int[] scoreArray2 = new int[10]; // HERE the 10 INSIDE [] is the NUMBER OF VALUES that the ARRAY can have

//        Here the NUMBER INSIDE [] is the POSITION of a PARTICULAR ARRAY
//        The POSITION STARTS FROM ZERO i.e. 0 is the FIRST POSITION

        scoreArray2[0] = 5;    // FIRST POSITION
        scoreArray2[1] = 10;   // SECOND POSITION
        scoreArray2[2] = 15;   // THIRD POSITION

//        If the Position of ARRAY id NOT DEFINED then:
//        The DEFAULT VALUE IS 0

//        System.out.println(scoreArray2[2]);


        for (int i = 0; i < scoreArray2.length; i++){
            scoreArray2[i] = i * 10;
        }

//        System.out.println(scoreArray2[0]);
//        System.out.println(scoreArray2[1]);
//        System.out.println(scoreArray2[2]);
//        System.out.println(scoreArray2[3]);
//        System.out.println(scoreArray2[4]);
//        System.out.println(scoreArray2[5]);
//        System.out.println(scoreArray2[6]);
//        System.out.println(scoreArray2[7]);
//        System.out.println(scoreArray2[8]);
//        System.out.println(scoreArray2[9]);

        for (int i = 0; i < scoreArray2.length; i++){
            System.out.println(scoreArray2[i]);
        }


    }

}