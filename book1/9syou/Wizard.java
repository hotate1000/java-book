public class Wizard {
  String name;
  int hp;
  int mp;
  Hero he;

  public void heal(Hero h) {
    h.hp = h.hp + 30;
    System.out.println(h.hp);
  }

  public void heal() {
    // h.hp = h.hp + 30;
    // System.out.println(h.hp);
  }
}