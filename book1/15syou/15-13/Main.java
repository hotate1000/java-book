import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
  public static void main(String[] args) throws Exception {
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date d1   = f.parse("2000/09/22 01:02:21");
    System.out.println(d1);
    String s1 = f.format(d1);
    System.out.println(s1);

    Date d2   = new Date();
    String s2 = f.format(d2);
    System.out.println(d2);
  }
}