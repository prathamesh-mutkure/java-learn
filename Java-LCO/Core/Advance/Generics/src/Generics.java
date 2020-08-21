import java.util.ArrayList;

public class Generics {

    public static void main(String[] args){

//        GENERICS:
//        Generics is freedom to  perform any operation without mentioning its data type

        // We can do even without not adding <E>
        ArrayList mArray =  new ArrayList<>();

//        Generics in ArrayList allows us to
//        Add different types of DataTypes to a Single array
//        Without Pre-defining the DataType

        mArray.add(1);
        mArray.add(2);
//      mArray.add("number");
        mArray.add(4);

//        But its not a good practice to often use Generics
//        Too much Liberty in programming can result in crashes and Run-time errors
//        So, we should always restrict a ArrayList or any other Object to certain DataType

    }

}
