package flag.game;

import flag.math.Point;

public class Cannonball extends GameObject implements Movable {// 砲彈
	private Point step; // 砲彈移動速度及方向
	private static final Battlefield b = Battlefield.b; // 戰場

	public Cannonball(Point p, Point step) {
		super(p);
		this.step = new Point(step);
	}
	
	public Movable move() { // 依據移動速度換到下一位置
		p = p.add(step); // 使用 add 方法
		System.out.println("砲彈移到" + p); // 使用連接運算
		return (b.outOfField(this) || b.hitIgloo(this)) ?
			null : this;
	}
}
