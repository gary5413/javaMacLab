package flag.game;

import flag.math.Point;

public class Battlefield { // �Գ�
	private int width,height; // �Գ��j�p
	public Igloo i; // �Z���w
	public Flanker f; // ���x
	public Cannonball c; // ���u
	public static final Battlefield b = 
		new Battlefield(5,5); // �إ߾Գ�

	public Battlefield(int width,int height) {
		this.width = width;
		this.height = height;
	}

	public boolean hitIgloo(Cannonball c) { // �O�_�����Z���w
		if(c.getP().equals(i.getP())) { // �ϥ� equals ��k
			// ����
			i.exploding(); // �Z���w�z��
			i = null; // �M���Z���w
			return true; // �Ǧ^�����F
		}
		return false; // �Ǧ^�S������
	}

	public boolean outOfField(GameObject g) {
		Point p = g.getP(); // ���o���u��m
		if(p.x < 0 || p.y < 0) // �W�L����ɩΤW���
			return true;
		if(p.x >= width || p.y >= height)	// �W�L�k��ɩΤU���
			return true;
		return false;
	}
}
