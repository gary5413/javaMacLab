import java.util.*;

public class Pgm1708 {

  public static void main(String args[]) {

    String[] suit = {"黑桃", "紅心", "方塊", "梅花"};
    String[] list = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

    ArrayList<String> num = new ArrayList<>();
    for (int i=0;i<4;i++)     // 初始化集合元素值
      for (int j=0;j<13;j++)
        num.add(suit[i]+list[j]);

    Collections.shuffle(num);

    for(int i=1;i<5;i++) {
      System.out.print("\n第" +i+ "位玩家手上的牌是：");
      System.out.println(num.subList((i-1)*13,i*13));
    }
  }
}

