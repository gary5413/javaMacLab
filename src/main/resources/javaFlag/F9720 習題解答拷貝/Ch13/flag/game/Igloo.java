package flag.game;

import flag.math.Point;

public class Igloo extends Building { // �Z���w
	public Igloo(Point p) { // �ϥ� Point ����غc
		super(p);
	}
	
	public void exploding() { // �ϥγs���B��
		System.out.println("�b" + p +	"���Z���w�Q�R��" );
	}
}
