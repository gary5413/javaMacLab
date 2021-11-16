package flag.game;

import flag.math.Point;

public class Igloo extends Building { // 武器庫
	public Igloo(Point p) { // 使用 Point 物件建構
		super(p);
	}
	
	public void exploding() { // 使用連接運算
		System.out.println("在" + p +	"的武器庫被摧毀" );
	}
}
