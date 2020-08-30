public class Hero {
  private int hp;
  private String name;
  // Sword  sword;

  public Hero(String name) {
    this.name = name;
  }

  public void bye() {
    System.out.println(this.name + "勇者は別れを告げた");
  }

  // public void die() {
  private void die() {
    System.out.println(this.name + "は死んでしまった");
    System.out.println("GAMEOVER");
  }

  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠ってしまった");
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    // System.out.pritln("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
    this.hp = this.hp - 2;
    if (this.hp <= 0) {
      this.die();
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null){
      throw new IllegalArgumentException("名前がnullである。処理を中断する");
    } else if(name.length() <= 1){
      throw new IllegalArgumentException("名前が短すぎる。処理を中断する");
    } else if(name.length() >= 8){
      throw new IllegalArgumentException("名前が長すぎる。処理を中断する");
    }
    this.name = name;
  }

}