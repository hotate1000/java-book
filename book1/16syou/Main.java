// import java.util.ArrayList;

// public class Main {
//   public static void main(String[] args) {
//     ArrayList<Integer> points = new ArrayList<Integer>();
//     point.add(10);
//     point.add(80);
//     point.add(75);

//     for(int i : points) {
//       System.out.println(i);
//     }
//   }
// }


// import java.util.*;

// public class Main {
//   public static void main(String[] args) {
//     ArrayList<String> names = new ArrayList<String>();
//     names.add("奏");
//     names.add("朝香");
//     names.add("菅原");

//     Iterator<String> it = name.iterator();
//     while (it.hasNext()) {
//       String e = it.next();
//       System.out.println(e);
//     }
//   }
// }




// import java.util.HashSet;
// import java.util.Set;
// import java.util.TreeSet;
// import java.util.LinkedHashSet;

// public class Main {
//   public static void main(String[] args) {
//     Set<String> colors = new HashSet<String>();
//     colors.add("赤");
//     colors.add("青");
//     colors.add("黄");
//     colors.add("赤");

//     System.out.println("色は" + colors.size() + "種類");

//     for (String s : colors) {
//       System.out.println(s);
//     }


//     Set<String> words = new TreeSet<String>();
//     words.add("dog");
//     words.add("cat");
//     words.add("wolf");
//     words.add("panda");
    
//     for (String a : words) {
//       System.out.println(a);
//     }

//     Set<String> wordss = new LinkedHashSet<String>();
//     wordss.add("dog");
//     wordss.add("cat");
//     wordss.add("wolf");
//     wordss.add("panda");
    
//     for (String a : wordss) {
//       System.out.println(a);
//     }
//   }
// }





import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    int tokyo = prefs.get("東京都");
    System.out.println("東京の人口は" + tokyo);

    int kumamoto = prefs.get("熊本県");
    System.out.println("熊本県の人口は" + kumamoto);

    prefs.put("熊本県",190);
    int kumamoto2 = prefs.get("熊本県");
    System.out.println("熊本県の人口は" + kumamoto2);

    for (String key : prefs.keySet()) {
      int value = prefs.get(key);
      System.out.println(key + "人口は、" + value);
    } 
  }
}