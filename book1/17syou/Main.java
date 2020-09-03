import java.io.*;


public class Main {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      fw = new FileWriter("data.txt");
      fw.write("hello1");
      fw.write("hello1");
      
    } catch (Exception e) {
      System.out.println("何かしらの例外が発生");
    } finally {
      if (fw != null) {
        try {
          fw.close(); 
        } catch(IOException e) {
          ;
        }
      }
    }


    try (FileWriter fw2 = new FileWriter("data2.txt");) {
      fw2.write("hello2");
    } catch (Exception e) {
      System.out.println("何かしらの処理");
    }
  }

  // public void setAge(int age) {
  //   if (age < 0) {
  //     throw new IllegalArgumentException("年齢は正の数を指定すべきです。");
  //   }
  //   this.age = age;
  // }
}