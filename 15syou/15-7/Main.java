// import java.time.*;

// public class Main {
//   public static void main(String[] args) {
//     Instant i1 = Instant.now();

//     Instant i2 = Instant.ofEpochMilli(1600705425827L);
//     // long 1 = i2.toEpochMilli();
//     long i = i2.toEpochMilli();

//     ZonedDateTime z1 = ZonedDateTime.now();
//     ZonedDateTime z2 = ZonedDateTime.of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

//     Instant i3 = z2.toInstant();
//     ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

//     System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
//     System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());

//     if (z2.isEqual(z3)) {
//       System.out.println("これは同じ瞬間を指しています");
//     }
//   }
// }


// import java.time.*;

// public class Main {
//   public static void main(String[] args) {
//     LocalDateTime l1 = LocalDateTime.now();
//     LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);

//     ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
//     LocalDateTime l3 = z1.toLocalDateTime();


//     Year a1 = Year.now();
//     Year a2 = Year.of(2010);
//     System.out.println(a1);
//     System.out.println(a2);

//     System.out.println(l1);
//     System.out.println(l2);
//     System.out.println(z1);
//     System.out.println(l3);
//   }
// }



// import java.time.*;
// import java.time.format.*;

// public class Main {
//   public static void main(String[] args) {
//     DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//     LocalDate ldate = LocalDate.parse("2020/09/22",fmt);

//     LocalDate ldatep =ldate.plusDays(1000);
//     String str = ldatep.format(fmt);
//     System.out.println("1000日後は" + str);

//     LocalDate now = LocalDate.now();
//     if (now.isAfter(ldatep)) {
//       System.out.println("1000日後は過去日時です");
//     }
//   }
// }


import java.time.*;

public class Main {
  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2020,1,1);
    LocalDate d2 = LocalDate.of(2020,1,4);

    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1,d2);

    LocalDate d4 = d2.plus(p1);
    LocalDate d3 = d2.plus(p2);

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(p1);
    System.out.println(p2);

    System.out.println(d3);
    System.out.println(d4);
  }
}