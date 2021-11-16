package flag.game;

import flag.math.Point;

public class Flanker extends Building implements Movable { // ���x
	static final private Battlefield b = Battlefield.b; // �Գ�
	private Point step = upward; // �w�]���W����
	
	public Flanker(Point p) {
		super(p);
	}

	public Cannonball fire(Point step) {
		// ���ͤ@�T���u
		Cannonball c = new Cannonball(p, step);
		return c;
	}
	
	public Movable move() { // ���ʯ��x
		p = p.add(step); // ���ʦ�m
		if(b.outOfField(this)) { // �O�_�J��Գ����
			step = (step == upward) ? downward : upward; // �վ��V
			p = p.add(step); // �ϦV����
		}
		System.out.println("���x����G" + p);
		return this;
	}
}
