// import java.io.*;

// // public class Main {
// //   public static void main(String[] args) {
// //     FileReader fr = new FileReader("data.txt");
// //     int input = fr.read();
// //     while (input !=-1) {
// //       System.out.println((char)input);
// //       input = fr.read();
// //     }
// //     fr.close();
// //   }
// // }

// public class Main{
//   public static void main(String[] args) throws Exception {
//     FileWriter fw = new FileWriter("data.txt");

//     fw.write('そ');
//     fw.write('れ');
//     fw.write('で');
//     fw.write('は');
//     fw.close();
//   }
// }



// import java.io.InputStream;
// import java.net.URL;

// public class Main {
//   public static void main(String[] args) throws Exception {
//     URL u = new URL("https://book.impress.co.jp/");
//     InputStream is = u.openStream();
//     int i = is.read();

//     while (i != -1) {
//       char c = (char)i;
//       System.out.print(c);
//       i = is.read();
//     }
//   }
// }



import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
  public static void main(String[] args){
    JFrame frame = new JFrame("はじめてのGUI");
    JLabel label = new JLabel("Hello World!!");
    JButton button = new JButton("押してね");

    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,100);
    frame.setVisible(true);
  }
}