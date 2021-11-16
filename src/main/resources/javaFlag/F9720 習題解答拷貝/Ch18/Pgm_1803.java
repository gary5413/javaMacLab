import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1803 extends KeyAdapter {

  JTextField lookup = new JTextField();  // 顯示查詢結果
  JLabel result = new JLabel("");
  EasyDict mydict;

  public static void main(String[] args) {
    Pgm_1803 test = new Pgm_1803();
    test.init();
  }

  public Pgm_1803() {
    try {
      mydict = new EasyDict();
    } catch(IOException e) {
      System.exit(0);
    }
  }

  public void init() {
    JFrame f = new JFrame("簡易字典");

    // 加入兩個元件
    f.getContentPane().add(lookup,BorderLayout.NORTH);
    f.getContentPane().add(result,BorderLayout.CENTER);
    lookup.addKeyListener(this);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(240,120);
    f.setVisible(true);
  }

  public void keyPressed(KeyEvent e) {  // 按 Enter 鍵時進行查詢
    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
      result.setText(mydict.ask(lookup.getText()));
      lookup.setText("");
    }
  }
}

class EasyDict {

  TreeMap dict;

  public EasyDict() throws IOException {
    dict = new TreeMap();                  // 建立 TreeMap 物件
    String enword,chword;                  // 字典檔為 "dict.txt"
    Reader r = new BufferedReader(new FileReader("dict.txt"));
    StreamTokenizer fr = new StreamTokenizer(r);
                           // 用 StreamTokenizer 串流讀取『記號』
                                               // 讀到檔案結尾前
    while (fr.nextToken()!=StreamTokenizer.TT_EOF) { // 持續讀取
      enword = fr.sval;    // 取得英文單字
      if (fr.nextToken()!=StreamTokenizer.TT_EOF) {
        chword = fr.sval;  // 取得中文解釋
        dict.put(enword,chword);
      }
      else
        break;             // 若沒有讀到對應的中文解釋也跳出迴圈
    }
  }

  // 將原 EasyDict 中的 ask() 方法傳回值改為 String
  public String ask(String str)  {
    if (dict.get(str)!=null)  // 用 get() 方法找出集合中對應的值
      return str + " ==> " + dict.get(str);
    else
      return "對不起, 找不到這個字";
  }
}

