import java.net.URL;

public class MalformedURLException {

    public static void main(String args[]){


//        URL Library will not work outside of Try-Catch code


        try {

            URL url = new URL("https://google.com");

            System.out.println("PROTOCOL: " + url.getProtocol());

        } catch (java.net.MalformedURLException e){

            System.out.println("Correct Protocol " + e);

        }

//        URL url = new URL("https://google.com");
//
//        System.out.println(url.getProtocol());

    }

}
