public class Main {
  public static void main(String[] args) {
    methodA();
    methodB();
  }

  public static void methodA() {
    System.out.println("テスト１");
    methodB();
  }

  public static void methodB() {
    System.out.println("テスト２");
  }

}