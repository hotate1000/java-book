public class Main {
  public static void main(String[] args) {
    for(String u : args) {
      System.out.println(u);
    }
    System.out.println(args.length);

    int[] array = makeArray(5);
    for(int i : array) {
      System.out.println(i);
      System.out.println("b");
    }
  }

  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i=0; i < newArray.length; i++) {
      newArray[i] = i;
      System.out.println("a");
    }
    return newArray;
  }
}