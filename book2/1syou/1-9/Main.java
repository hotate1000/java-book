public class Main {
  public static void main(String[] args) {
    // final String FORMAT = "%-9s %-13s 所持金%,6d";
    // String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
    // System.out.println(s);
    // System.out.printf("製品番号%s-%02d", "SJV", 3);


    final String TEST = "%-13s %-13s 所持金 %-,15d";
    String s1         = String.format(TEST, "test1",     "test1",   32000);
    String s2         = String.format(TEST, "testtest2", "testte2", 333222000);
    System.out.println(s1);
    System.out.println(s2);



    // final String FORMAT = "製品番号%s-%02d";
    // String s = String.format(FORMAT, "SJV", 3);
    // // String s = String.format("製品番号%s-%02d", "SJV", 3);
    // System.out.println(s);
  }
}