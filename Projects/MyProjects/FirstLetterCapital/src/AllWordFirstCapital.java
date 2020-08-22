import java.util.Scanner;

public class AllWordFirstCapital {

    private static Scanner mScanner = new Scanner(System.in);

    private static String convert(String Str){

        char[] ch = Str.toCharArray();

        for (int i = 0; i < Str.length(); i++)
        {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i -1] == ' ')
            {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                    ch[i] = (char) (ch[i] - 'a' + 'A');
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
                    ch[i] = (char) (ch[i] + 'a' - 'A');
        }

        String nStr = new String(ch);
        return nStr;
    }

    public static void main(String[] args){

        System.out.println("Please enter a String:");
        System.out.println(convert(mScanner.nextLine()));
    }
}
