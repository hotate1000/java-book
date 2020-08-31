public class Main {
  public static void main(String[] args) {
    Account a = new Account();
    a.accountNumber = "4649";
    a.balance       = 1592;
    System.out.println(a.toString());
    System.out.println(a);


    Account a1 = new Account();
    a1.accountNumber =" 5000";
    Account a2 = new Account();
    a2.accountNumber ="5000";

    if (a1.equal(a2) == true) {
      System.out.println("a1とa2の口座番号は等しい");
    }else{
      System.out.println("a1とa2の口座番号は等しく無い");
    }
  }
}