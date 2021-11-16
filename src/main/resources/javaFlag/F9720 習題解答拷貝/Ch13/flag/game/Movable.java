package flag.game;

import flag.math.Point;

interface Movable { // 代表可移動特性的介面
	public static final Point upward = new Point(0,-1);
	public static final Point downward = new Point(0,1);
	Movable move(); // 代表移動的方法
}
