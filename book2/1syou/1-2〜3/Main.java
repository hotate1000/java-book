public class Main {
  public static void main(String[] args) {
    String s1 = "Java and JavaScript";
    if(s1.contains("Java")) {
      System.out.println("文字列s1は、Javaを含んでいます");
    }
    if(s1.endsWith("Java")) {
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));



    String s2 = "Java programming";
    System.out.println("文字列s1の4文字目は" + s2.charAt(3));
    System.out.println("文字列s1の4文字目以降は" + s2.substring(3));
    System.out.println("文字列s1の4文字目以降は" + s2.substring(3,8));



    String s3 = "Java programming";
    System.out.println(s3.toLowerCase());
    System.out.println(s3.toUpperCase());
    System.out.println(s3.trim());
    System.out.println(s3.replace("Java","dddd"));



    StringBuilder s4 = new StringBuilder();
    for(int i = 0; i < 10; i++) {
      s4 .append("Java");
    }
    String s = s4.toString();
    System.out.println(s);
    System.out.println(s4);



    String s5 = "こんにちはJava";
    char[] data1 = s5.toCharArray();
    // byte[] data2 = s5.getBytes("utf-8");
    byte[] data3 = s5.getBytes();

    for(int i = 0; i < data1.length; i++) {
      System.out.println(data1);

    }
    System.out.println(data3);
  }
}