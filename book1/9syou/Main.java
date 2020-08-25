public class Main {
  public static void main(String[] args) {
    // Hero h1 = new Hero();
    // h1.hp   = 100;

    // Hero h2 = new Hero();
    // h2      = h1;
    // h2.hp   = 200;

    // System.out.println(h1.hp);
    // System.out.println(h2.hp);


    Sword s  = new Sword();
    s.name   = "炎の件";
    s.damage = 10;

    Hero h   = new Hero("ミナト");
    // h.name   = "ミナト";
    // h.hp     = 100;
    System.out.println("現在の武器" + h.sw + "名前" + h.name);
    // System.out.println("現在の武器は" + h.sw.name);
    h.sw     = s;
    System.out.println("現在の武器は" + h.sw.name);
    System.out.println("現在の武器は" + h.sw);
    h.attack();

    Hero h1  = new Hero("たけし");
    System.out.println("現在の武器" + h1.sw + "名前" + h1.name);
    // h1.name  = "テスト";
    // h1.hp    = 220;

    Wizard w = new Wizard();
    w.heal(h);
    w.heal(h1);
    w.he     = h1;
    System.out.println(w.he.name);
    System.out.println(w.he.hp);

  }
}