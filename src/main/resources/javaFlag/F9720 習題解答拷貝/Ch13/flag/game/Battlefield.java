package flag.game;

import flag.math.Point;

public class Battlefield { // 戰場
	private int width,height; // 戰場大小
	public Igloo i; // 武器庫
	public Flanker f; // 砲台
	public Cannonball c; // 砲彈
	public static final Battlefield b = 
		new Battlefield(5,5); // 建立戰場

	public Battlefield(int width,int height) {
		this.width = width;
		this.height = height;
	}

	public boolean hitIgloo(Cannonball c) { // 是否擊中武器庫
		if(c.getP().equals(i.getP())) { // 使用 equals 方法
			// 擊中
			i.exploding(); // 武器庫爆炸
			i = null; // 清除武器庫
			return true; // 傳回擊中了
		}
		return false; // 傳回沒有擊中
	}

	public boolean outOfField(GameObject g) {
		Point p = g.getP(); // 取得砲彈位置
		if(p.x < 0 || p.y < 0) // 超過左邊界或上邊界
			return true;
		if(p.x >= width || p.y >= height)	// 超過右邊界或下邊界
			return true;
		return false;
	}
}
