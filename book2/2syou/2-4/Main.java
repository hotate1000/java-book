import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate d = LocalDate.parse("2011/08/21",f);

    System.out.println(d.format(f));

    d = d.plusDays(10);
    String str = d.format(f);
    System.out.println("10日後は" + str);

    LocalDate now = LocalDate.now();
    if(now.isAfter(d)) {
      System.out.println("nowはdより昔");
    }
  }
}