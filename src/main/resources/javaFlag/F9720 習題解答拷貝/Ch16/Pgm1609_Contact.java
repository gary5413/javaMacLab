import java.io.*;

public class Pgm1609_Contact implements Serializable {

  public Pgm1609_Contact (String s, String e, String m) {
    name = s;
    tele = e;
    mail = m;
  }

  public Pgm1609_Contact() { }

  // 傳回姓名和各項成績資料的方法
  public String getN () { return name; }
  public String getT () { return tele; }
  public String getM () { return mail; }
  public String toString () {
    return "姓名："+name+"\t電話："+tele+"\t電子信箱："+mail;
  }

  private String name;    // 姓名
  private String tele;    // 電話
  private String mail;    // 電子信箱
}
