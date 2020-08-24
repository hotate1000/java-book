public class Hero {
  String name;
  int    hp;

  public void attack() {}
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、寝て回復した");
    System.out.println("現在のhp：" + this.hp);
  }
  public void sit(int sec) {
    this.hp = this.hp + sec;
    System.out.println(this.name + "は、" + sec + "秒座った");
    System.out.println(this.name + "は、" + sec + "回復した");
    System.out.println("現在のhp：" + this.hp);
  }
  public void slip() {
    this.hp = this.hp - 5;
    System.out.println(this.name + "は、転んだ");
    System.out.println("現在のhp：" + this.hp);
  } 
  public void run() {
    System.out.println(this.name + "は、逃げた");
    System.out.println("GAMEOVER");
    System.out.println("最終のhp：" + this.hp);
  }

}