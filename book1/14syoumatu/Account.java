public class Account {
  String accountNumber;
  int balance;


  public String toString() {
    return "¥" + this.balance + "(口座番号="+ this.accountNumber + ")";
  }

  public boolean epuals (Object o) {
    if (this == o) { return true; }
    if (o instanceof Accout) {
      Account a =(Account)o;
      String an1 = this.accountNumber.trim();
      if (an1.equals(an2)) {
        return true;
      }
    }
    return false;
  } 
}