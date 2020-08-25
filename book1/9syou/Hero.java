public class Hero {
  int hp;
  String name;
  Sword sw;


  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージ");
    System.out.println(this.name + "は" + sw.name + "で攻撃した");
  }

  public Hero(String name) {
    this.hp   = 100;
    this.name = name;
  }

  public Hero() {
    this.hp = 100;
    this.name = "ダミー";
  }


}