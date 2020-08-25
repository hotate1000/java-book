public class Main {
  String name;
  int    hp;
  int    mp;

  public static void main(String[] args) {
    Thief thief1 = new Thief("アサカ", 100, 100);
    System.out.println("名前" + thief1.name + " HP" + thief1.hp + " MP" + thief1.mp);


    Thief thief2 = new Thief("テツヤ", 200);
    System.out.println("名前" + thief2.name + " HP" + thief2.hp + " MP" + thief2.mp);

    Thief thief3 = new Thief("タケシ");
    System.out.println("名前" + thief3.name + " HP" + thief3.hp + " MP" + thief3.mp);

    int baseHp = 25;
    Thief t = new Thief("テスト", baseHp);
    System.out.println(baseHp + ":" + t.hp);

    System.out.println(baseHp);
    heal(t);
    System.out.println(baseHp + ":" + t.hp);
  }

  public static void heal(int a) {
    a = a + 10;
    System.out.println(a + "テス1");
  } 

  public static void heal(Thief a) {
    a.hp = a.hp + 10;
    System.out.println(a + "テス2");
    System.out.println(a.hp + "テス2");

  }
}