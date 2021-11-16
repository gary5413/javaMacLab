import java.io.*;

class HanoiTowerGame {

	int go(int discs) {
		return hanoiTower('A','C','B',discs);
	}

	// 實際搬動碟子
	void moveDisc(char source,char target,int disc){
		System.out.println("將" + disc + "號碟子從柱子 " +
			source + " 搬到 " + target);
	}

	// 傳回值：搬動次數
	// a：來源柱子
	// c： 目的地
	// b：空的柱子
	// discs：碟子數量
	int hanoiTower(char a,char c,char b,int discs) {
		if(discs == 1) { // 直接搬動，遞迴結束
			moveDisc(a,c,discs);
			return 1;
		}

		// 先將最大碟子以外的碟子搬到B
		int preSteps = hanoiTower(a,b,c,discs - 1);

		// 把最大的碟子搬到C
		moveDisc(a,c,discs);

		// 把搬到B的碟子搬到C
		int postSteps = hanoiTower(b,c,a,discs - 1);

		// 加總次數
		return preSteps + 1 + postSteps;
	}
}

public class Pgm0803 {

	public static void main(String[] argv) throws IOException{
		HanoiTowerGame game = new HanoiTowerGame();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		System.out.print("請輸入碟子數量：");
		int discs = java.lang.Integer.parseInt(br.readLine());

		System.out.println("搬動次數：" + game.go(discs));
	}
}
