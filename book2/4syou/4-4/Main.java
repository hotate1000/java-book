import java.util.*;


class Hero {
  public String name;
  // public boolean equals(Object o) {
  //   return true;
  // }
  public int hashCode() {
    int result = 37;
    return result;
  }
}

public class Main {
  public static void main(String[] args) {
    Set<Hero> list = new HashSet<Hero>();
    Hero h1 = new Hero();

    h1.name = "ミナト";
    list.add(h1);
    System.out.println(h1.name);

    System.out.println("要素数=" + list.size());
    h1 = new Hero();
    h1.name = "ミナト";
    System.out.println("要素数=" + list.size());
    list.remove(h1);
    System.out.println("要素数=" + list.size());
    System.out.println(h1.name);
  }
}
