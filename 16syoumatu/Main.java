import java.util.HashSet;
import java.util.Set;


public class Main {
  public static void main(String[] args) {
    Set<String> names = new HashSet<String>();

    names.add ("斎藤");
    names.add ("鈴木");

    for (String s : colors) {
      System.out.println(s);
    }
  }
}

Hero h1 = new Hero("斎藤");
Hero h2 = new Hero("鈴木");

List<Hero> heros = new ArrayList<Hero>();
heros.add(h1);
heros.add(h2);

for (Hero h : heros) {
  System.out.println(h);
}