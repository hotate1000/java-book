// public class Main {
//   public static void main(String[] args) {
//     long start = System.currentTimeMillis();

//     long end = System.currentTimeMillis();
//     System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");
//   }
// }



// import java.util.Date;

// public class Main {
//   public static void main(String[] args) {
//     Date now = new Date();

//     System.out.println(now);
//     System.out.println(now.getTime());

//     Date past = new Date(1);
//     System.out.println(past);
//   }
// }



// import java.util.Calendar;
// import java.util.Date;

// public class Main {
//   public static void main(String[] args) {
//     Calendar c = Calendar.getInstance();
//     c.set(2019,8,22,1,23,45);
//     c.set(Calendar.MONTH,11);

//     Date d = c.getTime();
//     System.out.println("テスト" + d);

//     Date now = new Date();
//     c.setTime(now);
//     int y = c.get(Calendar.YEAR);
//     System.out.println("今年は" + y + "年です");
//   }
// }



import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws Exception{
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date d = f.parse("2020/09/20 01:23:45");

    System.out.println(d);

    Date now = new Date();
    String s = f.format(now);
    System.out.println("現在は" + s + "です");
  }
}