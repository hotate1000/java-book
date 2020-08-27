public abstract class Hero {
  int    hp;
  int    mp;
  String name;

  public Hero(String name) {
    this.name = name;
  }

  public abstract void run();

  public void heel() {
    System.out.println(this.name + "は、回復した");
  }
}