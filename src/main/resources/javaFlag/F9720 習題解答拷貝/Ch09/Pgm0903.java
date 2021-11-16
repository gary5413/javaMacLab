import java.io.*;

class Checker { // �Ѥl
	static String[] names = {"��","��","��"};
	private static int[] values = {-1,1,0};
	private int state = 0; // 0:"O",1:"X",2:�٥��U

	public int toInt() {
		return values[state];
	}
	
	public String toString() {
		return names[state];
	}
	
	public Checker(int state) {
		this.state =  state;
	}		
}

class Board {
	Checker[][] board;
	
	public Board() {
		board = new Checker[3][3];
		for(int i = 0;i < 3;i++)
			for(int j = 0;j < 3;j++)
				board[i][j] = new Checker(2);
		show();
	}
	
	public void show() {
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) 
				System.out.print(board[i][j]);
			System.out.println("");
		}
	}

	public int winner() { 
		int result;
		for(int i = 0;i < 3;i++) {
			result = 0;
			for(int j = 0;j < 3;j++) 
				result += board[i][j].toInt();
			if(result == -3)
				return 0; // player0 win
			else if(result == 3)
				return 1; // player1 win
		}
		
		for(int i = 0;i < 3;i++) {
			result = 0;
			for(int j = 0;j < 3;j++) 
				result += board[j][i].toInt();
			if(result == -3)
				return 0; // player0 win
			else if(result == 3)
				return 1; // player1 win
		}
		
		result = 0;
		for(int i = 0,j = 0;i < 3;i++,j++)
			result += board[i][j].toInt();
		if(result == -3)
			return 0; // player0 win
		else if(result == 3)
			return 1; // player1 win
			
		result = 0;	
		for(int i = 0,j = 2;i < 3;i++,j--)
			result += board[i][j].toInt();
		if(result == -3)
			return 0; // player0 win
		else if(result == 3)
			return 1; // player1 win
		return -1; // �����ӭt
	}
	
	public boolean setChecker(int state,int x,int y) {
		if((x < 3 && x >= 0) && (y < 3 && y >= 0)) {
			board[y][x] = new Checker(state);
			show();
			return true;
		}
		else {
			System.out.println("�U����m�I");
			return false;
		}

	}
}

public class Pgm0903 {

	public static void main(String[] argv) throws IOException {
		Board b = new Board(); // �إߴѽL
		BufferedReader br = new
			BufferedReader(new InputStreamReader(System.in));
		
		int x,y,winner,steps = 0;
		while(steps < 9) {
			System.out.print((steps % 2) + "�����a�п�Jx��m (0..2)->");
    	x = java.lang.Integer.parseInt(br.readLine());
			System.out.print((steps % 2) + "�����a�п�Jy��m (0..2)->");
    	y = java.lang.Integer.parseInt(br.readLine());
    	if(b.setChecker(steps % 2,x,y)) {
	    	winner = b.winner();
	    	steps++;
	    	if(winner != -1) {
	    		System.out.println(winner + "�����aĹ�F");
	    		break;
	    	}
    	}
    }
	}
}
