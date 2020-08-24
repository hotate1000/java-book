public class Cleric {
  int hp = 50;
  int mp = 50;
  final int MAX_HP = 50;
  final int MAX_MP = 50;

  public void selfAid() {
    this.mp = this.mp - 5;
    this.hp = this.MAX_HP;
    System.out.println("セルフエイドを唱えた！hpが最大となった");
  }

  public void pray(int pray) {
    int random = new java.util.Random().nextInt(3);
    int prays = pray + random;

    if (this.mp + prays >= this.MAX_MP) {
      this.mp = this.MAX_MP;
    }else{
      this.mp = this.mp + prays;
    }
    
    System.out.println("現在のmpは" + this.mp + "です");
  }

}