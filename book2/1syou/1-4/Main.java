public class Main {
  public static void main(String[] args) {

    String s = "abc,def:ghi";
    String[] words = s.split("[,:]");
    for(String w : words) {
      System.out.println(w + ">");
    }


    String ss = "abc,def:ghi";
    String ww = ss.replaceAll("[a-z]","y");
    String www = ss.replace("[a-z]","y");

    System.out.println(ww);
    System.out.println(www);


    System.out.printf("製造番号%s-%02d","SJV",3);
  }
  // boolean isValidPlayerName(String name) {
  //   if(name.length() !=8) {
  //     return false;
  //   }

  //   char first = name.charAt(0);
  //   if(!(first >= 'A' && first <= 'Z')) {
  //     return false;
  //   }

  //   for(int i = 1; i < 8; i++) {
  //     char c = name.charAt(i);
  //     if(!((c >= 'A' && c <= 'Z') ||(c >= '0' && c <= '9'))) {
  //       return false;
  //     }
  //   }
  //   return false;
  // }
  // boolean isValidPlayerName(String name) {
  //   return name.matches("[A-Z][A-Z0-9]{7}");
  // }


  
}