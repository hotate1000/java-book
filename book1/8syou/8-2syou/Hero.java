public class Hero {
  String name;
  int hp;
  // フィード

  public void sleep() {
  // メゾット
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した。");
  }

  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println("Hpが" + sec + "回復した。");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }

  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GSMEOVER");
    System.out.println("最終HPは" + this.hp + "でした。");
  }
}

