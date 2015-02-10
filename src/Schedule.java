import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Schedule {
    public static void main(String[] args)
    {
        //SimpleDateFormat df = new SimpleDateFormat("dd.MM.YYYY-HH:mm:ss");
        GregorianCalendar dc = new GregorianCalendar(2015,1,10,20,23,15);
        User u = new User("pasha", TimeZone.getTimeZone(("Europe/Moscow")), true);
        u.AddEvent(dc.getTime(), "Hello worldsd!");
        u.ShowInfo();
    }
}
