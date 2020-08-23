public class Main {
// 問題１
  // public static void main(String[] args) {
  //   introduceOneself();
  // }

  // public static void introduceOneself() {
  //   String name   = "tomo";
  //   int    age    = 30;
  //   double tool   = 170.5;
  //   char   zyuuni = '鼠';

  //   System.out.println(name + "さん、の年齢は" + age + "です。");
  // }


// 問題２
  // public static void main(String[] args) {
  //   email("test", "email", "送付した");
  // }

  // public static void email(String title, String address, String text) {
  //   System.out.println(address + "に、以下のメールを送付しました");
  //   System.out.println("件名：" + title);
  //   System.out.println("本文：" + text);
  // }


// 問題３
  // public static void main(String[] args) {
  //   email("addres", "text");
  // }

  // public static void email(String address, String text) {
  //   System.out.println(text + "に、以下のメールを送信しました");
  //   System.out.println("件名：無題");
  //   System.out.println("本文：" + address);
  // }



// 問題４
  public static void main(String[] args) {
    double triangle = calcTriangleArea(10, 5);
    System.out.println("三角形の面積は" + triangle + "");

    double cirele   = calcCircleArea(10);
    System.out.println(cirele   + "円の面積");
  }

  public static double calcTriangleArea(double bottom, double height) {
    double triangle = bottom * height / 2;
    return triangle;
  }

  public static double calcCircleArea(double radius) {
    // double circle   = radius;
    double circle   = Math.round(Math.pow(radius / 2,2) * Math.PI * 10) / 10.0;
    return circle;
  }
}

