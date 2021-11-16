package flag.game;

import flag.math.Point;

abstract class GameObject {
	protected Point p; // �Z���w��m

	protected GameObject (Point p) { // �ϥ� Point ����غc
		this.p = new Point(p);
	}
	
	public Point getP() { // ���o��m
		return new Point(p);
	}
}
