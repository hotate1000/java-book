public class Main {
  public static void main(String[] args) {
    if(name.length() !=8) {
      return false;
    }

    if(!(first >= 'A' && first <= 'Z')) {
      return false;
    }

    if(int i = 1; i < 8; i++) {
      char c = name.charAt(i);
      if(!(c >= 'A' && c <= 'Z') || (c >= '0' && '9')) {
        return false;
      }
    }
    return true;
  }
}