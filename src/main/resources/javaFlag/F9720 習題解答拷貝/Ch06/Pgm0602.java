import java.io.*;

public class Pgm0602 {

  public static void main(String args[]) throws IOException {

    System.out.print("�п�J�@��ơG");
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int n = Integer.parseInt(str);
    
    for (int i=1;i<=n;i++) 
      System.out.println(i + "*" + i + "=" + i*i);
  }
}