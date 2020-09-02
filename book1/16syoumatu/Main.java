// 16-1
// (1)Set (2)List (3)Map

import java.util.ArrayList;
import java.util.*;


public class Main {
  public static void main(String[] args) {

    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    System.out.println(h1);
    h1.getName();
    System.out.println(h1.getName());
    // System.out.println(h1.name);
    // h2.name;


    ArrayList<Hero> names = new ArrayList<Hero>();
    names.add(h1);
    names.add(h2);
    for (Hero i : names) {
      System.out.println(i.getName());
    }


    Map<Hero,Integer> namess = new HashMap<Hero,Integer>();
    namess.put(h1,3);
    namess.put(h2,7);

    for (Hero key : namess.keySet()) {
      int value = namess.get(key);
      System.out.println(key.getName() + "の人口は、" + value);
    }

  }
}