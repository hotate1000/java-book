public class SuperHero extends Hero implements Ran {

  public SuperHero(String name) {
    super(name);
  }

  public void run() {
    System.out.println(this.name + "は、走って逃げた");
  }

  public void watch() {
    System.out.println(this.name + "は、確認した");
  }
}