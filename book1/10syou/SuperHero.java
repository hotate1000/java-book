public class SuperHero extends Hero {
  boolean flying;

  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }

  public void run() {
    this.name = "たけし";
    System.out.println(this.name + "は、撤退した");
  }
}