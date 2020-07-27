// public class Main {
//   public static void main(String[] args) {
//     Hero h1 = new Hero();
//     Hero h2 = new Hero();
//     Thief t1 = new Thief();
//     Wizard w1 = new Wizard();
//     Wizard w2 = new Wizard();

//     h1.hp += 50;
//     h2.hp += 50;
//     t1.hp += 50;
//     w1.hp += 50;
//     w2.hp += 50;

//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     Character[] c = new Character[5];
//     c[0] = new Hero();
//     c[1] = new Hero();
//     c[2] = new Hero();
//     c[3] = new Hero();
//     c[4] = new Hero();

//     for (Character ch:c) {
//       ch.hp += 50;
//     }
//   }
// }


public class Main {
  public static void main(String[] args) {
    Monster[] monsters = new Monthers[3];
    monsters[0] = new Slime();
    monsters[1] = new Goblin();
    monsters[2] = new DeathBat();
    for(Monster m : monsters) {
      m.run();
    }
  }
}






