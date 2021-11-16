import java.util.*;

public class Ex17_10  {

  public static void main(String args[]) {

  ArrayList mylist = new ArrayList();
  mylist.add("Hello");

  Iterator it = mylist.iterator();
  while (it.hasNext())
    it.remove();
  System.out.println("已移除所有元素：");
  System.out.println(mylist);
  }
}
