import java.time.*;

public class Main {
  public static void main(String[] args) {
    // Instant i1 = new Instant();
    Instant i1 = Instant.now();
    System.out.println(i1);

    Instant i2 = Instant.ofEpochMilli(3332221113333L);
    long a2    = i2.toEpochMilli();
    System.out.println(i2);
    System.out.println(a2);



    ZonedDateTime z1 = ZonedDateTime.now();
    System.out.println(z1);
    ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
    System.out.println(z2);



    Instant i3 = z2.toInstant();
    System.out.println(i3);
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
    System.out.println(z3);



    System.out.println("東京" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());

    System.out.println("ロンドン" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
  }
}