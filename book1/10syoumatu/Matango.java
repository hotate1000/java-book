public class Matango {
  int  hp = 500;
  char suffix;

  public Matango(char suffix) {
    this.suffix = suffix;
  }

  public void attack(Hero h) {
    System.out.println("キノコ" + this.suffix + "の攻撃");
    System.out.println(h.name + "は10のダメージ受けた");
    h.hp = h.hp - 10;
    System.out.println(h.name + "の残りhpは" + h.hp);
    System.out.println(this.hp);
  }
}