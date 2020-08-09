public class Main {
  public static void main(String[] args) {
    String s = "avc,def:ghi";
    String[] words = s.split("[,:]");

    for(String w : words) {
      System.out.println(w + "->");
    }

    String w = s.replaceAll("[,:]","-");
    System.out.println(w);
  }
}