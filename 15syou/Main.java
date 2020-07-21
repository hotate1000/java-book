public class Main {
  public static void main(String[] args) {
    String s1 = "スッキリJava";
    String s2 = "Java";
    String s3 = "java";

    if(s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
      // 文字が同じ
    }
    if(s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
      // 大文字、小文字を区別しないで文字が等しい
    }

    System.out.println("s1の長さは" + s1.length() + "です");
    // 文字列
    
    if(s1.isEmpty()) {
      System.out.println("s1は空文字です");
    }



    String s21 = "Java and JavaScript";

    if (s21.contains("Jaba")) {
      System.out.println("文字列s1は、Javaを含んでいます");
    }
    if (s21.endsWith("Java")) {
      System.out.println("文字列s1は、Javaが末尾にあります");
    }
    System.out.println("文字列ss1で最初にJavaが登場する位置は" + s21.indexOf("Java"));
    System.out.println("文字列ss1で最後にJavaが登場する位置は" + s21.lastIndexOf("Java"));




    String s31 = "Java programming";
    System.out.println("文字列s1の4文字目は" + s31.charAt(3));
    System.out.println("文字列s1の4文字目以降は" + s31.substring(3));
    System.out.println("文字列s1の4〜8文字目以降は" + s31.substring(3,8));




    String s41 = "TEST programming";
    System.out.println("文字を大文字から小文字に変更する" + s41.toLowerCase());
    System.out.println("文字を小文字から大文字に変更する" + s41.toUpperCase());
    System.out.println("スペースを削除する" + s41.trim());
    System.out.println(s41.replace("ing","消し"));
  }
}