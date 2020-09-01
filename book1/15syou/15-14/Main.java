import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
  // 15-14
    Instant i1 = Instant.now();
    System.out.println(i1);
    Instant i2 = Instant.ofEpochMilli(16007542587L);
    System.out.println(i2);
    long l     = i1.toEpochMilli();
    System.out.println(l);
    System.out.println("");


    ZonedDateTime z1 = ZonedDateTime.now();
    System.out.println(z1);
    ZonedDateTime z2 = ZonedDateTime.of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
    System.out.println(z2);
    System.out.println("");


    Instant i3       = z1.toInstant();
    System.out.println(i3);
    System.out.println("");


    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
    ZonedDateTime z4 = i3.atZone(ZoneId.of("America/Los_Angeles"));
    System.out.println(z3);
    System.out.println(z4);
    System.out.println("");


    ZonedDateTime z5 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    System.out.println(z5);
    System.out.println("");


    System.out.println("東京:" + z1.getYear() + "  " + z1.getMonth() + "  " + z1.getDayOfMonth());
    System.out.println("ロンドン:" + z3.getYear() + "  " + z3.getMonth() + "  " + z3.getDayOfMonth());
    System.out.println("");



  // 15-15
    LocalDateTime l1 = LocalDateTime.now();
    System.out.println(l1);
    LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);
    System.out.println(l2);

    ZonedDateTime z6 = l1.atZone(ZoneId.of("Europe/London"));
    System.out.println(z6);
    LocalDateTime z7 = LocalDateTime.now(ZoneId.of("Europe/London"));
    LocalDateTime z8 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
    LocalDateTime z9 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println("aaa" + z7);
    System.out.println(z8);
    System.out.println(z9);

    LocalDateTime z10 = z3.toLocalDateTime();
    LocalDateTime z11 = z4.toLocalDateTime();
    System.out.println("aaa" + z10);
    System.out.println("aaa" + z11);
    System.out.println("");



  // 15-16
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    System.out.println(fmt);
    LocalDate ldate       = LocalDate.parse("2020/09/22",fmt);
    System.out.println(ldate);
    System.out.println("");

    LocalDate ldatep      = ldate.plusDays(1);
    System.out.println(ldatep);
    String str            = ldatep.format(fmt);
    System.out.println("1000日後は" + ldatep);
    System.out.println("1000日後は" + str);
    
    LocalDate now = LocalDate.now();
    if(now.isBefore(ldatep)) {
      System.out.println("a");
    }else{
      System.out.println("b");
    }


  // 15-17
    LocalDate d1 = LocalDate.of(2020,1,1);
    LocalDate d2 = LocalDate.of(2020,1,4);

    Period p1    = Period.ofDays(2);
    Period p2    = Period.ofDays(4);
    System.out.println(p1);
    System.out.println(p2);

    Period p3    = Period.between(d1,d2);
    System.out.println(p3);

    LocalDate d3 = d2.plus(p2);
    System.out.println(d3);
  }
}