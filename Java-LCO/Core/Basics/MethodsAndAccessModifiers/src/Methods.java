//    ACCESS MODIFIER(Two Things):

//    PUBLIC - Visible to Everyone
//    PRIVATE - Visible only to the Class
//    PROTECTED - Visible to the package and all sub-classes

//    STATIC - Written statically(Can be changed later)
//    FINAL - Once written it is final and can't be changed


//    FUNCTIONS:

//    modifier ReturnDataType MethodName(Parameter list){
//             //body
//    }

public class Methods {

    public static void main(String args[]){

        sayHello();                         // Below Function's NAME

        int mNumberOne = 11;
        int mNumberTwo = 13;

//        int mResult = minimumNumber(mNumberOne, mNumberTwo);
//        System.out.println(mResult);
//        OR

        System.out.println(minimumNumber(mNumberOne, mNumberTwo));

    }


    public static void sayHello(){          // Here sayHello is our Function's NAME

        System.out.println("Hello Java");   // We need to write the FUNCTION NAME in main function

    }


    public static int minimumNumber(int mNum1, int mNum2){

        int mMin;

        if (mNum1 > mNum2){
            mMin = mNum2;
        } else {
            mMin = mNum1;
        }

        return mMin;

    }

}