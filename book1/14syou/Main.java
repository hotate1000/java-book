public class Main {
  public static void main(String[] args) {
    // Empty e = new Empty();
    // String s = e.toString();
    // System.out.println(s);

    Hero h = new Hero();
    h.name = "ミナト";
    h.hp   = 100;
    System.out.println(h.toString());


    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp   = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp   = 50;
    if(h.equals(h1) == true) {
      System.out.println("同じ内容1");
    }else {
      System.out.println("違う内容1");
    }
    if(h.equals(h2) == true) {
      System.out.println("同じ内容2");
    }else {
      System.out.println("違う内容2");
    }


    System.out.println(Hero.money);
  }
}