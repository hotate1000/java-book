import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤");

    System.out.println("色は" + colors.size() + "色です");

    Set<String> colorss = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    for (String s : colors) {
      System.out.print(s + "→");
    }
    System.out.println("");



    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for(String sss : words) {
      System.out.println(sss);
    }
  }
}