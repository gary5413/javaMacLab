import java.util.*;

public class Ex17_10  {

  public static void main(String args[]) {

  ArrayList mylist = new ArrayList();
  mylist.add("Hello");

  Iterator it = mylist.iterator();
  while (it.hasNext())
    it.remove();
  System.out.println("�w�����Ҧ������G");
  System.out.println(mylist);
  }
}
