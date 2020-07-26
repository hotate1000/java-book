// import java.io.*;

// public class Main {
//   public static void main(String[] args) {
//     try {
//       FileWriter fw = new FileWriter("data.txt");
//     }catch (IOException e) {
//       System.out.println("エラーが発生しました");
//     }
//   }
// }



public class Main {
  public static void main(String[] args) {

    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException例外をcatchしました");
      System.out.println("--スタックトレース(ここから)--");
      e.printStackTrace();
      System.out.println("--スタックトレース(ここまで)--");
    }
      
  }
}