import java.io.*;

public class Pgm1609_Contact implements Serializable {

  public Pgm1609_Contact (String s, String e, String m) {
    name = s;
    tele = e;
    mail = m;
  }

  public Pgm1609_Contact() { }

  // �Ǧ^�m�W�M�U�����Z��ƪ���k
  public String getN () { return name; }
  public String getT () { return tele; }
  public String getM () { return mail; }
  public String toString () {
    return "�m�W�G"+name+"\t�q�ܡG"+tele+"\t�q�l�H�c�G"+mail;
  }

  private String name;    // �m�W
  private String tele;    // �q��
  private String mail;    // �q�l�H�c
}
