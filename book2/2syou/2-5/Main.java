import java.time.*;
import java.time.format.*;


public class Main {
  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2012,01,03);
    LocalDate d2 = LocalDate.of(2012,01,06);

    System.out.println(d1);
    System.out.println(d2);

    Period p1 = Period.ofDays(3);
    System.out.println(p1);

    Period p2 = Period.between(d1,d2);
    System.out.println(p2);

    LocalDate d3 = d2.plus(p2);
    System.out.println(d3);
  }
}