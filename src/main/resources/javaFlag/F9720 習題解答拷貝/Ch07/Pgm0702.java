import java.io.*;

public class Pgm0702 {
  public static void main(String[] argv) {
    int[] data = new int[19]; // 纗耏浑翴计瞷Ω计
    int base=0;
    for(int i=1;i<=6;i++)     // 3 癹伴だ 3 浑
      for(int j=1;j<=6;j++)   // i+j+k 碞琌耏翴计
        for(int k=1;k<=6;k++) { 
          data[i+j+k]++;        // 盢Ω计じ 1
          base++;               // 仓Ω计
        }

    for(int point=0;point<data.length;point++)
      if(data[point]>0)
        System.out.println("耏"+ point + "翴诀瞯" +
                           base+ "だぇ" + data[point]);
  }  
}
