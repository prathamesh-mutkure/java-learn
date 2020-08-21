public class Switch {

    public static void main(String[] args){


//        This EXAMPLE is of RATING SYSTEM for Apps!

        int star = 10;


//        Here we are comparing the value of variable 'star' with that of the value after all cases
//        When the value matches then the sout of it iis PRINTED


//        Only ONE VALUE can match the value of VARIABLE
//        Otherwise the DEFAULT sout is PRINTED

//        Here the BREAK is COMPULSORY
//        Otherwise if ONE case matches then all the subsequent cases will get PRINTED
//        Including the DEFAULT one!


//        'CASE' is helpful when there can be only limited number of values
//        We should always add DEFAULT so that our app don't crash


        switch (star){
            case 1 :
                System.out.println("The rating is 1");
                break;
            case 2 :
                System.out.println("The rating is 2");
                break;
            case 3 :
                System.out.println("The Rating is 3");
                break;
            case 4 :
                System.out.println("The rating is 4");
                break;
            case 5 :
                System.out.println("The rating is 5");
                break;
            default:
                System.out.println("The rating can only be from 1-5");
        }


    }

}
