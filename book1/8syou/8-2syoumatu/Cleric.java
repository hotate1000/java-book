public class Cleric {
  String name;
  int hp    = 50;
  int maxHp = 50;
  int mp    = 10;
  int maxMp = 10;

  public void selfAid() {
    this.name = "aa";
    // this.name = "pさん";
    System.out.println(this.name + "セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.maxHp;
    System.out.println("MPを5消費し、全回しました！");
  }

  public void pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒祈りを唱えた。");
    
    int random = new java.util.Random().nextInt(2) + sec;
    int recoverActual = Math.min(this.maxMp - this.mp, random);

    this.mp = this.mp + recoverActual;
    
    System.out.println("マジックポイントが" + recoverActual + "回復した。"); 
  }
}