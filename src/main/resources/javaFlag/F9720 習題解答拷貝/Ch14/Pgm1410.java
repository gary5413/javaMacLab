import java.io.*;

// ���D�D�حn�D�ק�ҥ~���O,
// �G�N�غc��k�令�ݭn�@�� Account ���󬰰Ѽ�
class AccountError extends Exception { // �ۭq���ҥ~���O
  
  public AccountError(String message, Account a) { 
	super(message+"\n�������, �b�ᤤ�٦�" + a.checkBalance() + "��"); }
}

// �I�s AccountError �غc��k��, �h�Ǥ@�� this ���Ѽ�
class Account  {         // ²�檺�b�����O
  private long  balance; // �O���b��l�B

  public Account(long money) throws AccountError {   // �غc��k�[�J��l���B
    if (money <0)                                    // �O�_���t���ˬd
      throw new AccountError("�}����B���i���t��", this);  
    else
      balance = money;
  }

  // �s�ڪ���k
  public void deposite(long money) throws AccountError {
    if (money <0)
      throw new AccountError("�s�ڪ��B���i���t��", this); 
    else
      balance += money;
  }

  // ���ڪ���k
  public void withdraw(long money) throws AccountError {
    if (money > balance)
      throw new AccountError("�s�ڤ���", this);
    else
      balance -= money;
  }

  // ��b����k
  public void transfer(long money) throws AccountError {
    if ((money+10) > balance)   // ���]��b����O�Q��
      throw new AccountError("�s�ڤ���", this); 
    else if (money < 1)
      throw new AccountError("�ܤֻ���X�@��", this);  
    else
      balance -= money + 10;
  }

  public long checkBalance() { return balance; }  // �Ǧ^�l�B
}

public class Pgm1410 {

  public static void main(String[] argv) throws IOException {

    System.out.println("²��b������p��");
    System.out.print("�}��n�s�h�ֿ���");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    try {
      Account myAccount = new Account(Integer.parseInt(str));
      while (true) { // �B�z���j��
        System.out.print("\n�z�{�b�n(1)�s��(2)����(3)��b��");
        str = br.readLine();
        int choice = Integer.parseInt(str);
        System.out.print("�п�J���B��");
        str = br.readLine();
        int money = Integer.parseInt(str);

        switch (choice) {
          case 1:               // �s�ڳB�z
             myAccount.deposite(money);
             System.out.print("�s�F" + money + " ����, �b���ٳ� ");
             System.out.println(myAccount.checkBalance() + " ��");
             break;
          case 2:               // ���ڳB�z
             myAccount.withdraw(money);
             System.out.print("��F" + money + " ����, �b���ٳ� ");
             System.out.println(myAccount.checkBalance() + " ��");
             break;
          case 3:               // ��b�B�z
             System.out.print("�п�J���b����"); // ����J�ʧ@�Ȭ�����
             str = br.readLine();                  // �{�������ϥΦ���J���

             myAccount.transfer(money);
             System.out.print("��X" + money + " ���B����O�Q��, �b���ٳ� ");
             System.out.println(myAccount.checkBalance() + " ��");
        }
      }
    }
    catch (AccountError e) {
      System.out.println(e);
    }
    catch (NumberFormatException e) { // ������J�榡���~���ҥ~
      System.out.println("��J���~, "+e);
    }
  }
}
