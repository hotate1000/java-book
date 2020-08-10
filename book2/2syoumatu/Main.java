import java.text.SimpleDateFormat;
import java.util.Calender;
import java.util.Date;


public class Main {
  public static void main(String[] args) {
    Date d1 = new Date();

    Calendar c = Calendar.getTnstance();
    c.setTime(now);

    int day = c.get(Calendar.DAY_OF_MONTH);
    day = day + 100;

    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}