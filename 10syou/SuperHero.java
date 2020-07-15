public class SuperHero extends Hero {
  String name = "タケシ";
  boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  public void run() {
    System.out.println(this.name + "は、撤退した！");
  }

  public void attack() {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
    if (this.flying) {
      System.out.println(this.name + "の攻撃！");
      m.hp -= 5;
      System.out.println("5ポイントのダメージをあたえた！");
    }
  }

  public void attack(m) {
    super.attack(m) {
      if (this.flying) {
        super.attack(m);
      }
    }
  }

}





