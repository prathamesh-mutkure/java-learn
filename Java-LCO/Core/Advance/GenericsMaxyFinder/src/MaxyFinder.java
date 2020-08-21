import java.util.LinkedList;

public class MaxyFinder {


    public static <T extends Comparable<T>> T maxy(T x, T y, T z){

        T maxy = x;

        if (y.compareTo(maxy) > 0){
            maxy = y;
        }

        if (z.compareTo(maxy) > 0){
            maxy = z;
        }

        return maxy;

    }


    public static void main(String[] args){

//        We can use %x inside "" instead of any Variable Value
//        Where 'x' in %x is different for each DataType
//        %d -----------> INTEGER
//        %f -----------> FLOAT
//        and many more, example: here %d is for int

        System.out.printf("The max is: %d \n", maxy(4, 8, 2));

        Holder<String> stringValue = new Holder<>();
        stringValue.setMyVar("myStringVariable");
        System.out.println(stringValue.getMyVar());

        Holder<Integer> integerValue = new Holder<>();
        integerValue.setMyVar(10);
        System.out.println(integerValue.getMyVar());


    }

}
