public class Main {
  public static void main(String[] args) {
    // Hero h = new Hero("タケシ");
    FlyHero fh = new FlyHero("タケシ");
    fh.heel();
    fh.run();

    SuperHero sp = new SuperHero("ナオキ");
    sp.heel();
    sp.run();
    sp.watch();
  }
}