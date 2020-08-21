
class Banker{

    private String name;

    public Banker(String name){
        this.name = name;
    }

    public String greet(){
        return "Default Greetings";
    }

}


class SBI extends Banker{
    public SBI(){
        super("SBI Bank");
    }

    @Override
    public String greet(){
        return "Welcome to SBI Bank";
    }
}


class BOA extends Banker{

    public BOA(){
        super("BOA Bank");
    }

    @Override
    public String greet(){
        return "Welcome to BOA";
    }
}

class ICICIBank extends Banker{

    public ICICIBank(){
        super("ICICI Bank");
    }

    @Override
    public String greet(){
        return "Welcome to ICICI Bank";
    }

}


public class Polymorphism {

    public static void main(String args[]){

        for (int i = 1; i <= 5; i++){
            Banker banker = GenerateObjects();
            System.out.println(banker.greet());
        }

    }

    public static Banker GenerateObjects(){

        int random = (int) ((Math.random() * 3) + 1);
//        System.out.println(random);

        switch (random){
            case 1 :
                return new  SBI();
            //break;
            case 2 :
                return new BOA();
            //break;
            case 3:
                return new ICICIBank();
            //break;
            default:
                return null;
            //break;
        }

    }


}
