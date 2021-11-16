class Player extends Thread {
	public static int STONE = 0; // ���Y
	public static int PAPER = 1; // ��
	public static int CUTTER = 2; // �ŤM
	public static int UNKNOWN = -1; // �٥��X��
	public static String[] names = {"���Y","��","�ŤM"};
	public static final Pgm1502 game = new Pgm1502();
	public static boolean gameOver = false;
		
	public int current = UNKNOWN; // �ثe�X���A-1����٥��X��
	public int timesWon = 0; // Ĺ������
	public String playerName; // ���a�W��
	
	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	public void run() {
		while(!gameOver) {
			while(current != UNKNOWN)
			{
				synchronized(this) {
					try {
						wait();
					}
					catch(InterruptedException e) {}
				}
			}
			if(gameOver)
				break;
			current = (int)(Math.random() * 3); // �X��
			System.out.println(playerName + "�X" + names[current]);
			synchronized(this) {
				notify();
			}
		}
	}
}
	
public class Pgm1502 {
	public static void main(String[] argv) {
		Player.game.play();
	}
	
	public void play() {
		Player p1 = new Player("��");
		Player p2 = new Player("�A");
		p1.start();
		p2.start();
		
		while(!Player.gameOver) {
			while(p1.current == Player.UNKNOWN) {
				synchronized(p1) {
					try { // ���ҥX��
						p1.wait();
					}
					catch(InterruptedException e) {}
				}
			}
			while(p2.current == Player.UNKNOWN) {
				synchronized(p2) {
					try { // ���A�X��
						p2.wait();
					}
					catch(InterruptedException e) {}
				}
			}
			if(p1.current == Player.CUTTER && p2.current == Player.STONE) {
				System.out.println(p2.playerName + "Ĺ");
				p2.timesWon++;
			}
			else if(p2.current == Player.CUTTER && p1.current == Player.STONE) {
				System.out.println(p1.playerName + "Ĺ");
				p1.timesWon++;
			}
			else if(p1.current > p2.current) {
				System.out.println(p1.playerName + "Ĺ");
				p1.timesWon++;
			}
			else if(p2.current > p1.current) {
				System.out.println(p2.playerName + "Ĺ");
				p2.timesWon++;
			}
			System.out.println("�ثe" + p1.playerName + "Ĺ" + p1.timesWon + "��, " +
				p2.playerName + "Ĺ" + p2.timesWon + "��");
			if(p1.timesWon > 5 || p2.timesWon > 5)
				Player.gameOver = true;
			p1.current = p2.current = Player.UNKNOWN;
			synchronized(p1) {
				p1.notify();
			}
			synchronized(p2) {
				p2.notify();
			}
		}
	}
}