import java.util.*;


public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<Account>();
    
    Collections.sort(list);
  }

  public class Account implements Comparable<Account> {
    int number;

    public int compareTo(Account obj) {
      if(this.number < obj.number) {
        return -1;
      }
      if(this.number > obj.number) {
        retrun 1;
      }
      retrun 0;
    }
  }
}