public class Wizard extends Character {
  int mp = 50;

  public Wizard(String name) {
    this.name = name;
  } 

  public void attack(Matango m) {
    System.out.println(this.name + "の一撃！");
    System.out.println("敵の3ポイントのダメージ");
    m.hp = m.hp - 3;
    System.out.println("マタンゴの残りHP" + m.hp);
  }

  public void fireball(Matango m) {
    System.out.println(this.name + "は火の玉を放った");
    System.out.println("敵に20ポイントのダメージを与えた");
    m.hp = m.hp - 20;
    this.mp = this.mp - 5;
    System.out.println("残りのMPポイントは" + this.mp + "です");
  }
}