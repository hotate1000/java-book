public class FlyHero extends Hero {

  public FlyHero(String name) {
    super(name);
  }

  public void run() {
    System.out.println(this.name + "は、飛んで逃げた");
  }
}