public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wond;

  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int)(basePoint * this.wand.power);
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  public int    getHp()              { return this.hp; }
  public void   setHp(int hp)        { 
    if (hp < 0) {
      this.hp = 0;
    }
    this.hp = hp; 
  }
  
  public int    getMp()              { return this.mp; }
  public void   setMp(int mp)        { 
    if (mp < 0) {
      this.mp = 0;
    }
    this.mp = mp; 
  }
  
  public String getName()            { return this.name;}
  public void   setName(String name) { 
    if (name == null || name.length() <= 3) {
      throw new IllegalArgumentException("テス");
    } 
    this.name == name;
  }
  
  public Wand   getWond()            { return this.wand}
  public void   setWond(Wand wond)   { 
    if (wond == null) {
      throw new IllegalArgumentException("杖を装備");
    }
    this.wand = wand;
  }
    
}

