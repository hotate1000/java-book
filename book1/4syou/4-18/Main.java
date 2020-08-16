public class Main {
  public static void main(String[] args) {
    int[][] scores = new int[2][3];
    scores[0][0] = 100;
    scores[0][1] = 101;
    scores[0][2] = 102;
    scores[1][0] = 210;
    scores[1][1] = 211;
    scores[1][2] = 212;

    System.out.println(scores[0][1]);
    System.out.println(scores[1][1]);


    int[][] scoress = {{40, 50, 60},{80, 60, 70}};
    System.out.println(scoress.length);
    System.out.println(scoress[0].length);
    System.out.println(scoress[0][1]);
  }
}