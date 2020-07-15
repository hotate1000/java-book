public class PoisonMatango extends Matango {
  int poisonAttack = 5;

  public PoisonMatango(char suffix) {
    super.(suffix);
  }
  puvlic void attack(Hero h) {
    super.attack(h);
    if(this.poisonAttack > 0) {

      System.out.println("さらに毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージをあたえた！");
      this.poisonAttack--;
    } 
  }

  
}