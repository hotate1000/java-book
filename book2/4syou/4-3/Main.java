import java.util.*;

class Hero {
  public String name;
  public boolean equals(Object o) {
    // if(o == this) return true;
    // if(o == null) return false;

    // if(!(o instanceof Hero)) return false;
    return true;
  }
}

public class Main {
  public static void main(String[] args) {
    List<Hero> list = new ArrayList<Hero>();

    Hero h1 = new Hero();
    h1.name = "ミナト";

    list.add(h1);
    System.out.println("要素数=" + list.size());

    h1 = new Hero();
    h1.name = "ミナト";
    list.remove(h1);
    System.out.println("要素数=" + list.size());
  }
}