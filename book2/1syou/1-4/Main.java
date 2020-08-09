public class Main {
  public static void main(String[] args) {
    StringBuilder a = new StringBuilder();

    for(int i = 0; i < 3; i++) {
      a.append("Java");
    }
    a.append("t");
    a.append("e");
    a.append("s");
    a.append("t");

    String b = a.toString();
    System.out.println(b);


    // System str = "こんにちはJava";
    // char[] data1 = str.toCharArray();
    // byte[] date2 = str.getBytes("utf-8");
    // byte[] date3 = str.getBytes();
  }
}