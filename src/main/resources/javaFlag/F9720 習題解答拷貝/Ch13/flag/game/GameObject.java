package flag.game;

import flag.math.Point;

abstract class GameObject {
	protected Point p; // 武器庫位置

	protected GameObject (Point p) { // 使用 Point 物件建構
		this.p = new Point(p);
	}
	
	public Point getP() { // 取得位置
		return new Point(p);
	}
}
