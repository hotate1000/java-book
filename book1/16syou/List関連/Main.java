import java.util.ArrayList;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);

  
    for (int i = 0; i < points.size(); i++) {
      System.out.println(points.get(i)); 
    }
    System.out.println("");
    System.out.println("");

    for (int i : points) {
      System.out.println(i);
    }
    System.out.println("");
    System.out.println("");

    
    ArrayList<String> names = new ArraList<String>();
    names.add("奏");
    names.add("朝香");
    names.add("菅原");

    Iterator<String> it = names.iterator();
    while (it.hasNaxt()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}