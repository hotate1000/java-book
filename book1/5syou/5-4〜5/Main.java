public class Main {
  public static void main(String[] args) {
    System.out.println("メゾットを呼び出す");
    hello("てすと");
    hello("tesuto");
    hello("テスト");

    add(3,2);
    add(30,20);
  }

  public static void hello(String name) {
    System.out.println(name + "さんこんには");
  }

  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}