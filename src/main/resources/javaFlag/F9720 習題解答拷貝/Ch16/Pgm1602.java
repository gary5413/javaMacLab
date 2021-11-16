import java.io.*;

public class Pgm1602 {

  public static void main(String args[]) throws IOException {

    BufferedReader br =
      new BufferedReader(new FileReader("NineNine"));

    String str;

    while ((str=br.readLine())!=null)
      System.out.println(str);
  }
}
