public class Main {
  
  // public boolean isValidPlayerName(String name) {
  //   if (name.length != 8) {
  //     return false;
  //   }

  //   char first = name.charAt(0);
  //   if(!(first >= 'A' && first <= 'Z')) {
  //     return false;
  //   }

  //   for(int i = 1; i < 8; i++) {
  //     char c = name.charAt(i);
  //     if (!((c >= 'A' && c >= '0' && c <= '9'))) {
  //       return false;
  //     }
  //   }
  // }


  // public boolean isValidPlayerName(String name) {
  //   return name.matches("[A-Z][A-Z0-9]{7}");
  // }


  // public static void main(String[] args) {
  //   StringBuilder sb = new StringBuilder();
  //     String s = "Java";
  //     sb.append(s.matches("Java"));
  //     sb.append(s.matches("JavaJava"));
  //     sb.append(s.matches("java"));
  //     sb.append("    ");

  //     sb.append("Java".matches("J.va"));
  //     sb.append("Jaaaaava".matches("Ja*va"));
  //     sb.append("test".matches(".*"));
  //     sb.append("    ");

  //     sb.append("url".matches("[a-z]{3}"));
  //     sb.append("    ");

  //     String ss = sb.toString();
  //     System.out.println(sb);    
  // }

  public static void main(String[] args) {
    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for (String w : words) {
      System.out.print(w + "->");
    }


    String g = "avc,def:ghi";
    String h = s.replaceAll("[beh]","X");
    System.out.println(h);
    System.out.println("    ");


    // String a = String.format("%d日で%sわかる%s入門",3,"スッキリ","Java");
    // System.out.println(String.format("%d日で%sわかる%s入門",3,"スッキリ","Java"));
    System.out.printf("%d日で%sわかる%s入門",3,"スッキリ","Java");



    // final String FORMAT = "%-9 %-13s 所持金%, 6d";
    // String s = String.format(FORMAT, hero.getName(), hero.getJpb(), hero.getGold());
    // String.out.println(s);
  }



}