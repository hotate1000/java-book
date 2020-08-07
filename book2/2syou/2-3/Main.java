import java.time.*;
import java.time.format.*;


public class Main {

  // public static void main(String[] args) {
  //   Instant i1       = Instant.now();

  //   Instant i2       = Instant.ofEpochMilli(3192291332L);
  //   long i           = i2.toEpochMilli();


  //   ZonedDateTime z1 = ZonedDateTime.now();
  //   ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

  //   Instant i3       = z2.toInstant();
  //   ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

  //   System.out.println("東京" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
  //   System.out.println("ロンドン" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
  //   System.out.println("これらは同じ瞬間を指しています");
  // }


  // public static void main(String[] args) {
  //   LocalDateTime l1 = LocalDateTime.now();
  //   LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);

  //   ZonedDateTime z1 = l1.atZone(ZoneId.of("Europe/London"));
  //   LocalDateTime l3 = z1.toLocalDateTime();

  //   System.out.println(l1);
  //   System.out.println(l3);
  //   System.out.println(z1);
  // }



  // public static void main(String[] args) {
  //   DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
  //   LocalDate d = LocalDate.parse("2011/08/21", f);

  //   d = d.plusDays(1000);
  //   String str = d.format(f);
  //   System.out.println("1000日後は" + str);

  //   LocalDate now = LocalDate.now();
  //   if (now.isAfter(d)) {
  //     System.out.println("nowはdより新しい");
  //   }
  // }

  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2012,1,1);
    LocalDate d2 = LocalDate.of(2012,1,4);

    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1,d2);

    LocalDate d3 = d2.plus(p2);

    System.out.println(p1);
    System.out.println(p2);
  }
}