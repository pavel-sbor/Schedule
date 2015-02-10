import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by Pavel on 09.02.2015.
 */
public class Schedule {
    public static void main(String[] args)
    {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.YYYY-HH:mm:ss");
        GregorianCalendar dc = new GregorianCalendar(2015,1,10,12,40,30);
        User u = new User("pasha", TimeZone.getTimeZone(("Europe/Moscow")), true);
        u.AddEvent(dc.getTime(), "Hello world!");
        u.ShowInfo();
    }
}
