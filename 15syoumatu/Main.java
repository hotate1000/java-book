// public class Main {
//   public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder();

//     for(int i=0; i<100; i++) {
//       sb.append(i+1).append(",");
//     }
//     String s = sb.toString();
//     System.out.println(s);
//   }


//   public String concatPath(String folder,String file) {
//     if(!folder.endsWith("¥¥")) {
//       folder += "¥¥";
//     }
//     return folder + file;
//   }
// }


// "Java".matches(".*");
// "Appp".matches("A¥d{1,2}");
// "USS".matches("U[a-zA-Z]{3}");


import java.time.*;
import java.time.format.*;
import java.time.format.DateTimeFormatter;

// public class Main {
//   public static void main(String[] args) {
//     Date now = new Date();
//     Claender c = Calendar.getInstance();

//     c.setTime(d);

//     int day = c.get(Calendar.DAY_OF_MONTH);
//     day += 100;

//     c.set(Calender.DAY_OF_MONTH, day);

//     Date future = c.getTime();

//     SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//     System.out.println(f.format(future));
//   }
// }


public class Main {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime future = now.plusDays(100);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    System.out.println(fmt);
    System.out.println(future.format(fmt));
  }
}