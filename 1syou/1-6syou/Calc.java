public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = CalcLogic.tasu(a, b);
    int hiku  = CalcLogic.hiku(a, b);

    System.out.println("足し算" + total + "引き算" + hiku);
  }
}