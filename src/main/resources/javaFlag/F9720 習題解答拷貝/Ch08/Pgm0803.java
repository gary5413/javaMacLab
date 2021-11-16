import java.io.*;

class HanoiTowerGame {

	int go(int discs) {
		return hanoiTower('A','C','B',discs);
	}

	// ��ڷh�ʺФl
	void moveDisc(char source,char target,int disc){
		System.out.println("�N" + disc + "���Фl�q�W�l " +
			source + " �h�� " + target);
	}

	// �Ǧ^�ȡG�h�ʦ���
	// a�G�ӷ��W�l
	// c�G �ت��a
	// b�G�Ū��W�l
	// discs�G�Фl�ƶq
	int hanoiTower(char a,char c,char b,int discs) {
		if(discs == 1) { // �����h�ʡA���j����
			moveDisc(a,c,discs);
			return 1;
		}

		// ���N�̤j�Фl�H�~���Фl�h��B
		int preSteps = hanoiTower(a,b,c,discs - 1);

		// ��̤j���Фl�h��C
		moveDisc(a,c,discs);

		// ��h��B���Фl�h��C
		int postSteps = hanoiTower(b,c,a,discs - 1);

		// �[�`����
		return preSteps + 1 + postSteps;
	}
}

public class Pgm0803 {

	public static void main(String[] argv) throws IOException{
		HanoiTowerGame game = new HanoiTowerGame();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�п�J�Фl�ƶq�G");
		int discs = java.lang.Integer.parseInt(br.readLine());

		System.out.println("�h�ʦ��ơG" + game.go(discs));
	}
}
