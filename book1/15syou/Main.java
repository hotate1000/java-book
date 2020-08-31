public class Main {
  public static void main(String[] args) {
  // 15-1
    String s11 = "スッキリ";
    String s12 = "Java";
    String s13 = "java";
    String s14 = "";
    String s15 = " ";

    if(s12.equals(s13)) {
      System.out.println("s12とs13は等しい");
    }
    
    if(s12.equalsIgnoreCase(s13)) {
  
      System.out.println("s12とs13は大文字小文字だと等しい");
    }

    System.out.println("s11の長さ" + s11.length() + "です");

    if(s12.isEmpty()) {
      System.out.println("s12は空文字");
    };

    if(s14.isEmpty()) {
      System.out.println("s14は空文字");
    }

    if(s15.isEmpty()) {
      System.out.println("s15は空文字");
    }


  // 15-2
    String s21 = "Java and JavaScript";
    if (s21.contains("Java")){
      System.out.println("s21は「Java」を含む");
    }
    if (s21.startsWith("Java")){
      System.out.println("Javaで始まる");
    }
    if (s21.endsWith("Script")){
      System.out.println("Scriptで終わる");
    }
    System.out.println(s21.indexOf("a"));
    System.out.println(s21.lastIndexOf("a"));


  // 15-3
    System.out.println(s21.charAt(1));
    System.out.println(s21.substring(3,8));
    System.out.println(s21.substring(3));
    System.out.println(s21.toLowerCase());
    System.out.println(s21.toUpperCase());
    System.out.println(s21.trim());
    System.out.println(s21.replace("Java","aaaa"));


  // 15-4
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) {
      sb.append("Java");
    }
    String s = sb.toString();
    System.out.println(s);

    char[] date = s21.toCharArray();
    for (int i = 0; i < date.length; i++) {
      System.out.println(date[i]);
    }


  // 15-7
    String s157 = "abc,def:ghi";
    String[] words = s157.split("[,:]");
    System.out.println(words);
    
    for (String w : words) {
      System.out.println(words);
      System.out.println(w);
      System.out.println(w + "->");
    }


  // 15-8
    String w = s157.replaceAll("[beh]","X");
    System.out.println(w);

  }


  // 15-5
  public boolean isValidPlayerName(String name) {
    if (name.length()!= 8) {
      return false;
    }
    char first = name.charAt(0);
    if(!(first >= 'A' && first <= 'Z')) {
      return false;
    }
    for (int i = 1; i < 8; i++) {
      char c = name.charAt(i);
      if (!((c >= 'A' && c <= 'Z')||(c >='0' && c <= '9'))) {
        return false;
      }
    }
    return true;
  }


  // 15-6
  public boolean isValidPlayerNames(String name) {
    return name.matches("[A-Z][A-Z0-9]{7}");
  }


  // 15-9
  

}