import java.io.*;

public class Pgm0505 {
	public static void main(String[] argv) throws IOException {
    BufferedReader br = new 
    	BufferedReader(new InputStreamReader(System.in));
    
    // ��ܹB��
    System.out.println("�п��(1)�T����(2)�x��(3)���");
    System.out.print("��");
 		String str = br.readLine();
    int choice = Integer.parseInt(str);
		
		int width; // ����
		int height; // ��
		int width2; // �W������
    System.out.println("�п�J(�U)����");
    System.out.print("��");
 		str = br.readLine();
    width = Integer.parseInt(str);
    System.out.println("�п�J��");
    System.out.print("��");
 		str = br.readLine();
    height = Integer.parseInt(str);
		switch(choice) {
			case 1: // �T����
				System.out.println("�T���έ��n���G" + (width * height / 2.0));
				break;
			case 2:
				System.out.println("�x�έ��n���G" + (width * height));
				break;
			case 3:
		    System.out.println("�п�J�W����");
		    System.out.print("��");
		 		str = br.readLine();
		    width2 = Integer.parseInt(str);
				System.out.println("��έ��n���G" + ((width + width2) * height / 2.0));
				break;
			default:
				System.out.println("����F");
		}
	}
}