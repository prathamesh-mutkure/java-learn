import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Sample {

    public static void main(String[] args) {

        // Formatter
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        // Date as string ID
        String d1 = sdf.format(Calendar.getInstance(Locale.getDefault()).getTime());
        System.out.println("\nDate: " + d1);

        String ID = dateToID(17, 07, 2019);
        System.out.println("\nDateToID : " + ID);

        String date = sdf.format(IDToDate(ID));
        System.out.println("\nIDToDate : " + date);

    }

    private static String dateToID(int dd, int mm, int yyyy) {

        String ID = String.format("%02d%02d%d", dd, mm, yyyy);

        return ID;
    }

    private static Date IDToDate(String ID) {

        int dd, mm, yyyy;

        StringBuffer ddStr = new StringBuffer();
        StringBuffer mmStr = new StringBuffer();
        StringBuffer yyyyStr = new StringBuffer();

        ddStr.append(ID.charAt(0)).append(ID.charAt(1));
        mmStr.append(ID.charAt(2)).append(ID.charAt(3));
        yyyyStr.append(ID.charAt(4)).append(ID.charAt(5)).append(ID.charAt(6)).append(ID.charAt(7));

        dd = Integer.parseInt(String.valueOf(ddStr));
        mm = Integer.parseInt(String.valueOf(mmStr));
        yyyy = Integer.parseInt(String.valueOf(yyyyStr));

        Date date = new Date(yyyy, mm, dd);

        return date;
    }

}
