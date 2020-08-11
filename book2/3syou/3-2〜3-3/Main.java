import java.util.ArrayList;
import java.util.Iterator;


public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("渚");
    names.add("朝香");
    names.add("菅野");

    for(String i : names) {
      System.out.println(i);
    }


    Iterator<String> it = names.iterator();

    while(it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}