package flag.game;

import flag.math.Point;

abstract class Building extends GameObject {
	protected Building(Point p) { // 使用 Point 物件建構
		super(p);
	}
}
