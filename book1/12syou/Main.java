public class Main {


  public static void main(String[] args) {
    Wizard w  = new Wizard("魔法使い");
    // Wizard w  = new Wizard();
    Matango m = new Matango();

    Character c = w;
    // w.name = "テスト";
    w.attack(m);
    w.fireball(m);
  }
}