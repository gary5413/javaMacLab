class Parent { // 父類別
  void Show() {
          System.out.println("我是父類別");
  }
}

class Child extends Parent { // 子類別
  void Show(String str) { // 多重定義的版本
          System.out.println(str);
  }
}

public class CallChild {
  public static void main(String[] argv) {
    Parent p = new Parent(); // 產生父類別的物件
    Child c = new Child(); // 產生子類別的物件
    p.Show(); // 呼叫父類別定義的方法
    c.Show(); // 呼叫子類別中定義的方法

    p = c;    // 用父類別的參照指向子類別
    if(p instanceof Child) {   // 如果 p 指向的是 Child 物件
      Child aChild = (Child)p; // 強制轉型
      aChild.Show("這樣可以嗎？");
    }
  }
}
