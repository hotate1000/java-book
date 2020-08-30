public class Main {


  public static void main(String[] args) {
    Wizard w  = new Wizard("魔法使い");
    // Wizard w  = new Wizard();
    Matango m = new Matango();

    Character c = w;
    // w.name = "テスト";
    w.attack(m);
    c.attack(m);
    w.fireball(m);
  }
}


/* 
public class Main {
  public static void main(String[] args) {
    Character[] c = new Charcter[];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();

    for(ch : c) {
      ch.hp += 50;
    }
  }
}
*/
