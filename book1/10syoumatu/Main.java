// 問題１
  // ③⑤

// 問題２
  // (1)machine, mobile_phone
  // (2)machine, Engine
  // (3)book, 1syou

public class Main { 
  public static void main(String[] args) {
    Hero hero = new Hero("たけし");

    Matango mata1 = new Matango('A');

    hero.mata = mata1;
    mata1.attack(hero);
    System.out.println(hero.mata.hp);

    PoisonMatango pm = new PoisonMatango('a');
    pm.attack(hero);
  }
}