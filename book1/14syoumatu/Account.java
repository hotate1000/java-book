public class Account {
  String accountNumber;
  int    balance;


  public String toString() {
    return "¥¥" + this.balance + "(口座番号=" + this.balance + ")";
  }

  public boolean equals(Object o) {
    if(this == o) {return true;}

    if(o instanceof Account) {
      Account ac = (Account)o;
      String ac1 = this.accountNumber.trim();
      String ac2 = ac.accountNumber.trim();
      if (ac1.equal(ac2)) {
        return true;
      }
    }
    return false;
  }

}
