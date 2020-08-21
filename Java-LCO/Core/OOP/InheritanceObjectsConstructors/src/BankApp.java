public class BankApp {

    //    VARIABLES/PROPERTIES/FIELDS:
    String name;
    int age;
    String taxDetail;
    double amount;


//    CONSTRUCTOR:

    // FORMAT:
    // AccessModifiers ClassName(DataType VariableName){
    //                    Body
    // }

    public BankApp(String name){
        this.name = name;
    }

//    "this." KEYWORD refers the VARIABLE which is DEFINED INSIDE THE CLASS AND OUTSIDE THE CONSTRUCTOR OR FUNCTION


//    METHODS:
//    Ask Users for details

    public void mAge(int age){
        this.age = age;
    }

    public void mTax(String taxDetail){
        this.taxDetail = taxDetail;
    }

    public void mAmount(double amount){
        this.amount = amount;
    }


    public void mGetUserInfo(){
        System.out.println();
        System.out.println("The name of the user is: " + this.name);
        System.out.println("The age of the user is: " + age);
        System.out.println("The Balance is: " + "$" + amount);
    }




}
