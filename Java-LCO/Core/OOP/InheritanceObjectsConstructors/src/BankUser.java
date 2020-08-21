public class BankUser {

//    OBJECTS are work INDEPENDENTLY and do not inter-fare
//    JOHN and JANE are OBJECTS

    public static void main(String args[]){

        // CREATING OBJECT
        // HERE "new" is used to create OBJECT
        BankApp John = new BankApp("John Doe");
        John.mAge(30);
        John.mAmount(300000);
        John.mGetUserInfo();


        BankApp Jane = new BankApp("Jane Doe");
        Jane.mAge(25);
        Jane.mAmount(100000);
        Jane.mGetUserInfo();


        //    INHERITANCE STARTS HERE:

        SBIUser hitesh = new SBIUser("hitesh");
        hitesh.mAmount(70000);
        hitesh.mAge(35);
        hitesh.mTax("MyTaxDetails");
        hitesh.mGetUserInfo();

    }

}
