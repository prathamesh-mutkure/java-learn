public class PrimativeDataTypes {

    public static void main(String[] args){

//        System.out.println("New Module");
        System.out.println("Common DataTypes in Java are listed below in comments: ");


//        byte    : -128 to 127
//        short   : -32768 to 32767
//        int     : -2,147,483,648
//        long    : 9,223,372,036,854,775,808
//
//        float   : 235.2f       Smaller Decimal Expansion
//        double  : 245.36       Larger Decimal Expansion
//        boolean : true/false   Yes or No--Yes/No
//        char    : 'x'          Just a Single Character
//
//        String  : "Anything"   Any Word or Sentence



//        byte myByte = 24;
//        System.out.println(myByte);


        // Its a common practise in java to write 'm' before the variable Name
        // FORMAT: mNAME

        // Doesn't give Decimal value
        int mInt = 22 / 7;

        // Give Decimal Value upto 6 digits
        // Its a common practice to add an 'f' after Float
        // Consumes 4 Bytes of Data
        float mFloat = 22 / 7f;

        // Give Decimal Value upto 15 digits
        // Its a common Practice to add an 'd' after Double
        // Consumes 8 Bytes of Data
        double mDouble = 22 / 7d;

        System.out.println("Int value is: " + mInt);
        System.out.println("Float value is: " + mFloat);
        System.out.println("Double value is: " + mDouble);



        boolean isActive = false;
        System.out.println(isActive);

//      UNICODE VALUE
        char mChar = 'a';
        String mHexValue = Integer.toHexString(mChar);
        System.out.println(mHexValue);

//      USING \-u for....
        char mUnicode = '\u0080';
        System.out.println(mUnicode);



//      USING:
        String mString = "I am a String";
        System.out.println("The Answer is: " + mString);

//        Giving PROPERTIES to String
        System.out.println(mString.toUpperCase());
        System.out.println(mString.toLowerCase());

//        Does NOT get ADDED UP
        String mString1 = "10";
        String mString2 = "10";

//        Get Attached side-by-side
        System.out.println(mString2 + mString1);





    }

}
