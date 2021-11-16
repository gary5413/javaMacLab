import java.io.*;

public class Pgm0501 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));

    System.out.println("叫块计");
    System.out.print("△");

    String str = br.readLine();
    int num = Integer.parseInt(str);
    
    if(num % 2 == 0)
    	System.out.println("案计");
    else
    	System.out.println("计");
	}
}