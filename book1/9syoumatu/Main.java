public class Main {

  // public static void main(String[] args) {
  //   Thief t1 = new Thief("アサカ",40,5);
  //   System.out.print(t1.name);
  //   System.out.print(t1.hp);
  //   System.out.print(t1.mp);
  //   System.out.println("");

  //   Thief t2 = new Thief("アサカ",35);
  //   System.out.print(t2.name);
  //   System.out.print(t2.hp);
  //   System.out.print(t2.mp);
  //   System.out.println("");

  //   Thief t3 = new Thief("アサカ");
  //   System.out.print(t3.name);
  //   System.out.print(t3.hp);
  //   System.out.print(t3.mp);
  //   System.out.println("");
    
  //   Thief t4 = new Thief();
  //   System.out.print(t4.name);
  //   System.out.print(t4.hp);
  //   System.out.print(t4.mp);
  //   System.out.println("");    
  // }

  public static void heal(int hp) {
    hp += 10;
  }

  public static void heal(Thief thief) {
    thief.hp += 10;
  }

  public static void main(String[] args) {
    int baseHp = 25;
    Thief t = new Thief("アサカ", baseHp);
    System.out.println(baseHp + " : " + t.hp);
    heal(baseHp);
    heal(t);
    System.out.println(baseHp + " : " + t.hp);
  }
}