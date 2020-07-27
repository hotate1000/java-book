public class Hero {
  String name;
  int hp;
  Sword sword;

  public void attack() {
    sword = new Sword();
    // sword.name = "火の剣";
    this.name = "にんじんマン";
    System.out.println(this.hp + "は、攻撃した。");
    System.out.println("敵にダメージを与えた。");
    System.out.println(this.name + "は、" + sword.name + "で攻撃した。");
  }

  public Hero() {
    this.hp = 100;
  }
}