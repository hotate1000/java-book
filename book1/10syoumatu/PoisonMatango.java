public class PoisonMatango extends Matango {
  int hp;
  char suffixPm;
  int poisona = 5;

  public PoisonMatango(char suffixPm) {
    super(suffixPm);
  }
  public PoisonMatango() {
    super('z');
  }

  public void attack(Hero h) {
    super.attack(h);
    // System.out.println("毒攻撃開始");

    if(this.poisona <= 5 && this.poisona > 0) {
      System.out.println("さらに毒攻撃を行った");
      int a = h.hp / 5;
      h.hp = h.hp - a;
      System.out.println(a + "ポイントのダメージを受けた");
      System.out.println(h.name + "の残りhpは" + h.hp);
      this.poisona = this.poisona - 1;

    }  
  }
}