import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pgm_1803 extends KeyAdapter {

  JTextField lookup = new JTextField();  // ��ܬd�ߵ��G
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
    JFrame f = new JFrame("²���r��");

    // �[�J��Ӥ���
    f.getContentPane().add(lookup,BorderLayout.NORTH);
    f.getContentPane().add(result,BorderLayout.CENTER);
    lookup.addKeyListener(this);

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(240,120);
    f.setVisible(true);
  }

  public void keyPressed(KeyEvent e) {  // �� Enter ��ɶi��d��
    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
      result.setText(mydict.ask(lookup.getText()));
      lookup.setText("");
    }
  }
}

class EasyDict {

  TreeMap dict;

  public EasyDict() throws IOException {
    dict = new TreeMap();                  // �إ� TreeMap ����
    String enword,chword;                  // �r���ɬ� "dict.txt"
    Reader r = new BufferedReader(new FileReader("dict.txt"));
    StreamTokenizer fr = new StreamTokenizer(r);
                           // �� StreamTokenizer ��yŪ���y�O���z
                                               // Ū���ɮ׵����e
    while (fr.nextToken()!=StreamTokenizer.TT_EOF) { // ����Ū��
      enword = fr.sval;    // ���o�^���r
      if (fr.nextToken()!=StreamTokenizer.TT_EOF) {
        chword = fr.sval;  // ���o�������
        dict.put(enword,chword);
      }
      else
        break;             // �Y�S��Ū���������������]���X�j��
    }
  }

  // �N�� EasyDict ���� ask() ��k�Ǧ^�ȧאּ String
  public String ask(String str)  {
    if (dict.get(str)!=null)  // �� get() ��k��X���X����������
      return str + " ==> " + dict.get(str);
    else
      return "�藍�_, �䤣��o�Ӧr";
  }
}

