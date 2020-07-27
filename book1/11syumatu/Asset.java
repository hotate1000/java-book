public class Asset {
  String name;
  int price;

  public Asset(String name, int price, String color) {
    this.name  = name;
    this.price = price;
    this.color = color;

    public Asset(String name, int price) {
      this.name  = name;
      this.price = price;
    }

    public String getName() {return this.name;}
    public int getPrice() {return this.price;}
  }
}