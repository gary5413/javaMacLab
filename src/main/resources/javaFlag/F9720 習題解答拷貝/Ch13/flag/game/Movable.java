package flag.game;

import flag.math.Point;

interface Movable { // �N��i���ʯS�ʪ�����
	public static final Point upward = new Point(0,-1);
	public static final Point downward = new Point(0,1);
	Movable move(); // �N���ʪ���k
}
