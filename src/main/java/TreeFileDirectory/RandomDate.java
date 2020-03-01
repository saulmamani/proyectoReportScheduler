package TreeFileDirectory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RandomDate {
    public static Date nextDate() {
        String start = new SimpleDateFormat("yyyy-MM-dd 00:00:00").format(addSubtractDays(new Date(), -2));
        String end = new SimpleDateFormat("yyyy-MM-dd 23:00:00").format(addSubtractDays(new Date(), 2));
        long rangebegin = Timestamp.valueOf(start).getTime();
        long rangeend = Timestamp.valueOf(end).getTime();
        long diff = rangeend - rangebegin + 1;
        Timestamp rand = new Timestamp(rangebegin + (long) (Math.random() * diff));
        return rand;
    }

    private static Date addSubtractDays(Date date, int days)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        return calendar.getTime();
    }
}
