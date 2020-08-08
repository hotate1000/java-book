public class Main {
  public static void main(String[] args) {
    String s1 = "Java ingprogramming";

    System.out.println("文字列s1の3文字目は" + s1.charAt(2));
    System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
    System.out.println("文字列s1の4〜8文字目は" + s1.substring(3,8));



    System.out.println("文字列s1にprogを含んでいるか" + s1.contains("prog"));
    System.out.println("文字列s1がJaで始まるか" + s1.startsWith("Ja"));
    System.out.println("文字列s1がingで終わるか" + s1.endsWith("ing"));
    System.out.println("文字列s1のingが初めて登場する位置は" + s1.indexOf("ing"));
    System.out.println("文字列s1のingが後ろから初めて登場する位置は" + s1.lastIndexOf("ing")); 
  }
}