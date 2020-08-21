import java.util.ArrayList;

public class ArrayListAdvance {

    public static void main(String args[]){


//        ArrayList<String> mArrayList = new ArrayList<>();

        ArrayList<Integer> mAdvanceArrayList = new ArrayList<>();


        // SET VALUE

        for (int i = 1; i <= 20; i++){
            mAdvanceArrayList.add(Integer.valueOf(i));   //AutoBoxing
            //mAdvanceArrayList.add(i);                  //Required Syntax
        }


        // GET VALUE

        for (int i = 0; i < 20; i++){
            System.out.println("The value is: " + mAdvanceArrayList.get(i).intValue());  // UnBoxing
            //System.out.println("The value is: " + mAdvanceArrayList.get(i));           //Required Syntax
        }

    }

}