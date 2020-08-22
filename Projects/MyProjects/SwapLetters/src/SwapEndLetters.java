public class SwapEndLetters {

    private static String logic(String Str){

        char[] ch = Str.toCharArray();

        for (int i = 0; i < ch.length; i++){

            int k = i;

            while (i < ch.length && ch[i] != ' ')
                i++;

            // Swapping
            char temp = ch[k];
            ch[k] = ch[i - 1];
            ch[i - 1] = temp;

        }

        return new String(ch);

    }

    public static void main(String[] args){

        String str = "Hii Java here";

        System.out.println(logic(str));

    }

}
