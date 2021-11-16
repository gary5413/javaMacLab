package flag.game;

import flag.math.Point;

public class Flanker extends Building implements Movable { // 砲台
	static final private Battlefield b = Battlefield.b; // 戰場
	private Point step = upward; // 預設往上移動
	
	public Flanker(Point p) {
		super(p);
	}

	public Cannonball fire(Point step) {
		// 產生一枚砲彈
		Cannonball c = new Cannonball(p, step);
		return c;
	}
	
	public Movable move() { // 移動砲台
		p = p.add(step); // 移動位置
		if(b.outOfField(this)) { // 是否遇到戰場邊界
			step = (step == upward) ? downward : upward; // 調整方向
			p = p.add(step); // 反向移動
		}
		System.out.println("砲台移到：" + p);
		return this;
	}
}
