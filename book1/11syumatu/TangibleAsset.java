public abstract class TangibleAsset extends Asset implements Thing{
  // String name;
  // int price;
  String color;

  public TangibleAsset(String name, int price, String coler) {
    super(name,price);
    // this.name  = name;
    // this.price = price;
    this.color = color;
  }

  // public String getName(){return this.name;}
  // public int getPrice(){return this.price;}
  public String getColor(){return this.color;}
  public void setWeight(double weight){this.weight = weight; }
}