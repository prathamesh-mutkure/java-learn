public abstract class Banker {

    private String name;
    private String tax;
    private double balance;


    public Banker(String name, String tax, double balance){
        this.name = name;
        this.tax = tax;
        this.balance = balance;
    }


    public void greet(){
        System.out.println("Hello " + this.name + " , Your balance is " + this.balance);
    }


    public String getName(){
        return name;
    }
    public void setName(String mName){
        this.name = mName;
    }


    public String getTax() {
        return tax;
    }
    public void setTax(String mTax) {
        this.tax = mTax;
    }


    public double getBalance() {
        return balance;
    }
    public void setBalance(double mBalance) {
        this.balance = mBalance;
    }

}