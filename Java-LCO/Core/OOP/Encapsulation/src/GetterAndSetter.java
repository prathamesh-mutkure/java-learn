public class GetterAndSetter {

    public static void main(String[] args){

        myClass Johnny = new myClass();

        Johnny.setName("Johnny");
        Johnny.setAge(23);
        Johnny.setAccNo(1234);

        System.out.println("The name of the user is: " + Johnny.getName());
        System.out.println("The Age of the user is: " + Johnny.getAge());
        System.out.println("The Account No of the user is: " + Johnny.getAccNo());

    }

}

class myClass {

    private String name;
    private int age;
    private int accNo;

    //GETTER
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getAccNo() {
        return accNo;
    }


    //SETTER
    public void setName(String mName){
        this.name = mName;
    }

    public void setAge(int mAge){
        this.age = mAge;
    }

    public void setAccNo(int mAccNo){
        this.accNo = mAccNo;
    }



}