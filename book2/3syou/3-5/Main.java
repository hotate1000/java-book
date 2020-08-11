import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Main {
  public static void main(String[] args) {
    Set<String> colors = new HashSet<String>();

    colors.add("赤");
    colors.add("青");
    colors.add("黄");

    for(String i : colors) {
      System.out.println(i);
    }


    Iterator<String> it = colors.iterator();

    while(it.hasNext()) {
      String h = it.next();
      System.out.println(h);
    }
  }
}