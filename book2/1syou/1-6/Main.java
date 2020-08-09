public class Main {
  public static void main(String[] args) {
    String s = "Java";
    System.out.println(s.matches("Java"));
    System.out.println(s.matches("JavaJava"));
    System.out.println(s.matches("java"));

    System.out.println("Java".matches("J.va"));
    System.out.println("Jaaaaava".matches("Ja*va"));



    String ss = "Java test aaaaaaa";
    System.out.println(ss.matches("Ja.*"));
    System.out.println(ss.matches(".*a"));
  }
}