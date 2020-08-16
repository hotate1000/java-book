
// 問題3-1
  // weight == 60;
  // (age1 + age2) * 2 > 60;
  // age % 2 == 1;
  // name.equals('要');


// 問題3-2
  // c,d,e,f


// 問題3-3
public class Main {
  public static void main(String[] args) {
    // int isHungry = 1;
    // String food  = "リンゴ";

    // System.out.println("こんにちは");

    // switch (isHungry) {
    //   case 0:
    //   System.out.println("お腹いっぱい");
    //   break;

    //   case 1:
    //   System.out.println("はらぺこです");
    //   System.out.println(food + "をいただきます");
    //   System.out.println("ごちそうさま");
    //   break;

    //   default:
    // }





    // boolean tenki = true;
    // if (tenki == false) {
    //   System.out.println("洗濯");
    //   System.out.println("散歩");
    // }else{
    //   System.out.println("DVD");
    //   System.out.println("寝ます");
    // }





    // System.out.print("「[メニュー] 1:検索 2:登録 3:削除 4:変更>」");
    // int selected = new java.util.Scanner(System.in).nextInt();

    // switch (selected) {
    //   case 1:
    //   System.out.println("検索");
    //   break;

    //   case 2:
    //   System.out.println("登録");
    //   break;

    //   case 3:
    //   System.out.println("削除");
    //   break;

    //   case 4:
    //   System.out.println("変更");
    //   break;

    //   default:
    // }





    System.out.println("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(9);

    for(int i = 0; i < 5; i++) {
      System.out.println("0〜9の数字を入力してください");

      int num = new java.util.Scanner(System.in).nextInt();

      if (num == ans) {
        System.out.println("アタリ");
        break;
      } else {
      }
    }
    System.out.println("ゲーム終了");
  }
}
