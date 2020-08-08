public class Main {
  public static void main(String[] args) {
    String s1 = "Java ingprogramming";

    System.out.println("文字列s1の3文字目は" + s1.charAt(2));
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
    System.out.println("文字列s1の4〜8文字目は" + s1.substring(3,8));



    System.out.println("大文字を小文字に変換" + s1.toLowerCase());
    System.out.println("小文字を大文字に変換" + s1.toUpperCase());
    System.out.println("前後の空白を除去する" + s1.trim());

    System.out.println("文字列を置き換える" + s1.replace("Java","test"));
    System.out.println("文字列を置き換える" + s1.replace("Java",""));
  }
}