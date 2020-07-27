public class Main {
  public static void main(String[] args) {
    StringBuilder t = new StringBuilder();

    for (int i=0; i<100; i++) {
      // sb.append(i);
      t.append(i + 1).append(",");
    }
    // System.out.println(t);
    String s = t.toString();
    System.out.println(s);
    String[] a = s.split(".");
    System.out.println(a);



    // String concatPath(String folder, String file) {
    String concatPath(String folder, String file) {
      if(!folder.endsWith("¥¥")) {
        folder += ¥¥;
      }
      return folder + file;
    }    
  consatPath("a","a");
  }
}