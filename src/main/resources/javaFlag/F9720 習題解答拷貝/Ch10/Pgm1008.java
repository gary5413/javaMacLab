import java.io.*;

public class Pgm1008 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�r��G");		
		String str =  br.readLine(); // Ū���ϥΪ̿�J���	
		System.out.print("�п�J�n���N���r���G");		
		String oldChar =  br.readLine(); // Ū���ϥΪ̿�J���
		System.out.print("�п�J�n���N�����Ӧr���G");		
		String newChar =  br.readLine(); // Ū���ϥΪ̿�J���
		System.out.println(myReplace(str,oldChar.charAt(0),newChar.charAt(0)));
		System.out.print("�п�J�n���N���l�r��G");		
		oldChar =  br.readLine(); // Ū���ϥΪ̿�J���
		System.out.print("�п�J�n���N�����Ӧr��G");		
		newChar =  br.readLine(); // Ū���ϥΪ̿�J���
		System.out.println(myReplace(str,oldChar,newChar));
	}
	
	static String myReplace(String str,char oldChar,char newChar) {
		int pos;
		int start = 0;
		String result = "";
		while(start < str.length()) {
			pos = str.indexOf(oldChar,start);
			if(pos == -1) {
				result = result + str.substring(start);
				break;
			}
			result = result + str.substring(start,pos) + newChar;
			start = pos + 1;
		}
		return result;
	}

	static String myReplace(String str,String oldStr,String newStr) {
		int pos;
		int start = 0;
		String result = "";
		while(start < str.length()) {
			pos = str.indexOf(oldStr,start);
			if(pos == -1) {
				result = result + str.substring(start);
				break;
			}
			result = result + str.substring(start,pos) + newStr;
			start = pos + oldStr.length();
		}
		return result;
	}
}
		
