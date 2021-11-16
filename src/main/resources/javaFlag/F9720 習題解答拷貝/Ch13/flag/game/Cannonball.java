package flag.game;

import flag.math.Point;

public class Cannonball extends GameObject implements Movable {// ���u
	private Point step; // ���u���ʳt�פΤ�V
	private static final Battlefield b = Battlefield.b; // �Գ�

	public Cannonball(Point p, Point step) {
		super(p);
		this.step = new Point(step);
	}
	
	public Movable move() { // �̾ڲ��ʳt�״���U�@��m
		p = p.add(step); // �ϥ� add ��k
		System.out.println("���u����" + p); // �ϥγs���B��
		return (b.outOfField(this) || b.hitIgloo(this)) ?
			null : this;
	}
}
