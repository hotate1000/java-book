public class Main {
  public static void main(String[] args) {
    int[] scores = {10, 20, 30, 40, 50};
    int sum      = 0;
    
    for (int i = 0; i < scores.length; i++) {
      sum = sum + scores[i];
      // System.out.println(sum);
    }
    System.out.println(sum);
    int avg = sum / scores.length;
    System.out.println(avg);




    // int[] scores = {10, 20, 30, 40};

    // for (int i = 0; i < scores.length; i++) {
    //   System.out.println(scores[i]);
    // }
  }
}