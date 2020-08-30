public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("タケシ");
    h.bye();
    // h.die();
    h.sleep();
    
    King k = new King();
    k.talk(h);

    h.setName("aaaa");

    System.out.println(h.getName());
    
    h.bye();
  }
}