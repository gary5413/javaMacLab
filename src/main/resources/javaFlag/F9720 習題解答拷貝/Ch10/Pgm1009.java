import java.io.*;

public class Pgm1009 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�Ĥ@�Ӧr��G");		
		String str1 =  br.readLine(); // Ū���ϥΪ̿�J���	
		System.out.print("�п�J�ĤG�Ӧr��G");		
		String str2 =  br.readLine(); // Ū���ϥΪ̿�J���
		System.out.println("������G�G" + myCompare(str1,str2));
	}
	
	static int myCompare(String str1,String str2) {
		int pos = 0;
		while(true) {
			if(pos == str1.length() && pos < str2.length())
				return -str2.length();
			if(pos == str2.length() && pos < str1.length())
				return str1.length();
			if(pos == str1.length() && pos == str2.length())
				return 0;
			if(str1.charAt(pos) == str2.charAt(pos))
				pos++;
			else
				return str1.charAt(pos) - str2.charAt(pos);
		}
	}
}
		
