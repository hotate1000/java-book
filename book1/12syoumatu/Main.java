// 問題12-1
  // (1)Sword,Item,Sword,Item
  // (2)Monster,Slime,Slime,Monster

// 問題12-2
  // ①a(),b(),c()
  // ②y1.a() = Aa
  // ②y2.a() = Ba


// public class Main {
//   public static void main(String[] args) {
//     Y[] y = new Y[2];

//     y[0] = new A();
//     y[1] = new B();

//     for(Y yyy : y) {
//       yyy.a();
//     }
//   }
// }

public class Main {
  public static void main(String[] args) {
    Y[] y = new Y[2];

    y[0]  = new A();
    y[1]  = new B();

    for (Y tesu : y) {
      tesu.a();
    }
  }
}