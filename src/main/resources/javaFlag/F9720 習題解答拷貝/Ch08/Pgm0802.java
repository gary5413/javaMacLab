import java.io.*;

class Mathematics {
  long[] fibo=new long[61]; //可儲存數列前60項的陣列
  
  long fibonacci(int n) {   // 遞迴方法
    if(n <= 2) {
      return 1;
    }
    if(n<=60){   
      if(fibo[n]==0)  // 檢查陣列中是否已有前次算出的值
                      // 沒有就立即計算並存入陣列
        fibo[n]=fibonacci(n - 1) + fibonacci(n - 2);
      return fibo[n]; // 傳回陣列的值
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
		  System.out.print("請輸入 n(輸入0結束)：");
		  int n = java.lang.Integer.parseInt(br.readLine());

      if(n==0) break; // 輸入0即跳離迴圈
		  System.out.println(m.fibonacci(n));
    }
	}
}
