public class Hero {
  String name = "ミナト";
  int hp      = 100;

  public void attack(/*Matango*/int m) {
    System.out.println(this.name + "の攻撃");
    m -= 5;
    System.out.println("５ポイントのダメージを与えた");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した");
  }
}