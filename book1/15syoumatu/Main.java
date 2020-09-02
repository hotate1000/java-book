import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class Main {
  // 15-1
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100 ; i++) {
      // System.out.print(i + 1 + ",");
      sb.append(i + 1).append(",");
    }

    String s = sb.toString();
    String[] a = s.split(",");
    System.out.println(a);


  // 15-4
    Date date  = new Date();

    Calendar c = Calendar.getInstance();
    c.setTime(date);
    System.out.println(c);

    int day    = c.get(Calendar.DAY_OF_MONTH);
    System.out.println(day);

    day = day + 100;
    c.set(Calendar.DAY_OF_MONTH,day);

    Date now   = c.getTime();

    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    String sss = f.format(now);
    System.out.println(sss);
    

  // 15-5
    System.out.println("");
    LocalDate nowa = LocalDate.now();
    LocalDate futurea = nowa.plusDays(100);
    System.out.println(futurea);

    DateTimeFormatter fmta = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(futurea.format(fmta));
  }


  // 15-2
  // public String concatPath(String folder, String file) {
  //   if(!folder.endWith("¥¥")) {
  //     folder = folder + "¥¥";
  //   }
  //   return folder  + file;
  // }


  // 15-3
    // (1).*
    // (2)A¥d{1,2}
    // (3)U[A-Z]{2,4}

}