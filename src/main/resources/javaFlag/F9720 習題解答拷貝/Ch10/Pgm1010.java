import java.io.*;

public class Pgm1010 {
	
	public static void main(String[] argv) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入運算式：");		
		String str =  br.readLine(); // 讀取使用者輸入資料	
		if(str.matches("\\s*\\d+\\s*(\\s*[+\\-]\\s*\\d+\\s*)*"))
			System.out.println("計算結果：" + calculator(str));
		else
			System.out.println("運算式只能包含正整數、加法、減法運算子");
	}
	
	private static int nextOperator(String str,int start) {
		int plusPos,minusPos,opPos;
		plusPos = str.indexOf('+',start);
		minusPos = str.indexOf('-',start);
		plusPos = (plusPos == -1) ? str.length() : plusPos;
		minusPos = (minusPos == -1) ? str.length() : minusPos;
		opPos = (plusPos < minusPos) ? plusPos : minusPos;
		return opPos;
	}
		
	static int calculator(String str) {
		int pos = 0,opPos;
		int op1,op2 = 0;
		char operator;
		char curr = str.charAt(pos);;

		opPos = nextOperator(str,pos);
		op1 = Integer.parseInt(str.substring(pos,opPos).trim());
		pos = opPos;

		while(pos < str.length()) {
			operator = str.charAt(opPos);
			pos++;
			opPos = nextOperator(str,pos);
			op2 = Integer.parseInt(str.substring(pos,opPos).trim());
			pos = opPos;
			if(operator == '+')
				op1 += op2;
			else
				op1 -= op2;
		}
		return op1;
	}
}
		
