package TreeFileDirectory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomDate {
    public static Date nextDate() {
        String start = new SimpleDateFormat("yyyy-MM-dd 00:00:00").format(new Date());
        String end = new SimpleDateFormat("yyyy-MM-dd 23:00:00").format(new Date());
        long rangebegin = Timestamp.valueOf(start).getTime();
        long rangeend = Timestamp.valueOf(end).getTime();
        long diff = rangeend - rangebegin + 1;
        Timestamp rand = new Timestamp(rangebegin + (long) (Math.random() * diff));
        return rand;
    }
}
