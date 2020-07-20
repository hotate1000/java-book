// public class Main {
//   public stativ void main(String[] args) {
//     Empty e = new Empty;
//     String s = e.toString;
//     System.out.println(s);


//     Object o1 = new Empty();
//     Object o2 = new Hero();
//     Object o3 = "こんにちは";
    

//     public void printAnything(Object o) {
//       System.out.println(o.toString);
//     }

//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     Hero h = new Hero();
//     h.name = "ミナト";
//     h.hp = 100;
//     System.out.println(h.toString());
//   }
// }


public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp   = 100;
    Hero h2 = new Hero();
    h2.name = "みなと";
    h2.hp   = 100;
    
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    }else{
      System.out.println("違う内容");
    }

  }
}