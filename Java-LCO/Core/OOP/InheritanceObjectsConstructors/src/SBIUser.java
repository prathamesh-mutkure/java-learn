public class SBIUser extends BankApp {

//    USE OF KEYWORD "extends" above is to INHERIT BankApp Class

//    INHERITANCE:

    // SUPER:
    // super keyword is used to inherit/refer the constructor which is extended in the class

    public SBIUser(String name){
        super(name);
    }

    @Override
    public void mGetUserInfo() {
        super.mGetUserInfo();
        System.out.println("Users Tax Details: " + this.taxDetail);
    }
}
