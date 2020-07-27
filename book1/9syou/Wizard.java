public class Wizard {
  String name;
  int hp;

  public void heal(Hero h1) {
    h1.hp += 10;
    System.out.println(h1.name + "回復した" + h1.hp);
  }

  public void heal(Wizard w) {
    this.hp += 20;
    System.out.println(this.name + "回復した" + this.hp);
  }

}