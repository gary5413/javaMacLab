import java.io.*;

class Mathematics {
  long[] fibo=new long[61]; //�i�x�s�ƦC�e60�����}�C
  
  long fibonacci(int n) {   // ���j��k
    if(n <= 2) {
      return 1;
    }
    if(n<=60){   
      if(fibo[n]==0)  // �ˬd�}�C���O�_�w���e����X����
                      // �S���N�ߧY�p��æs�J�}�C
        fibo[n]=fibonacci(n - 1) + fibonacci(n - 2);
      return fibo[n]; // �Ǧ^�}�C����
    }
      
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

public class Pgm0802 {

	public static void main(String[] argv) throws IOException{
		Mathematics m = new Mathematics();

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

    while(true){
		  System.out.print("�п�J n(��J0����)�G");
		  int n = java.lang.Integer.parseInt(br.readLine());

      if(n==0) break; // ��J0�Y�����j��
		  System.out.println(m.fibonacci(n));
    }
	}
}
