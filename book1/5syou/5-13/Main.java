public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);

    for(int i : array) {
      System.out.println(i);
    }
  }

  public static void incArray(int[] tesu) {
    for (int i = 0; i < tesu.length; i++) {
      tesu[i] ++;
    }
  }
}