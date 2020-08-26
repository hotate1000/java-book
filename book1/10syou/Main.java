public class Main {
  public static void main(String[] args) {
    Hero hero = new Hero();
    hero.attack(10);
    hero.run();


    SuperHero sHero = new SuperHero();
    sHero.run();
    sHero.fly();

    hero.run();
  }
}