public class Wand {
  private String name;
  private double power;

  public String getName()              { return this.name; }
  public void   setName(String name)   { 
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("ミス");
    }
    this.name == name;
  }
  public double getPower()             { return this.power;}
  public void   setPower(double power) { 
    if (this.power < 0.5 || this.power <= 100 ) {
      throw new IllegalArgumentException("ミス");
    }  
    this.power = power;
  }

}