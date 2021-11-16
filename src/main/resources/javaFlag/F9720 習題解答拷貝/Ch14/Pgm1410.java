import java.io.*;

// 本題題目要求修改例外類別,
// 故將建構方法改成需要一個 Account 物件為參數
class AccountError extends Exception { // 自訂的例外類別
  
  public AccountError(String message, Account a) { 
	super(message+"\n交易失敗, 帳戶中還有" + a.checkBalance() + "元"); }
}

// 呼叫 AccountError 建構方法時, 多傳一個 this 為參數
class Account  {         // 簡單的帳戶類別
  private long  balance; // 記錄帳戶餘額

  public Account(long money) throws AccountError {   // 建構方法加入初始金額
    if (money <0)                                    // 是否為負的檢查
      throw new AccountError("開戶金額不可為負值", this);  
    else
      balance = money;
  }

  // 存款的方法
  public void deposite(long money) throws AccountError {
    if (money <0)
      throw new AccountError("存款金額不可為負值", this); 
    else
      balance += money;
  }

  // 提款的方法
  public void withdraw(long money) throws AccountError {
    if (money > balance)
      throw new AccountError("存款不足", this);
    else
      balance -= money;
  }

  // 轉帳的方法
  public void transfer(long money) throws AccountError {
    if ((money+10) > balance)   // 假設轉帳手續費十元
      throw new AccountError("存款不足", this); 
    else if (money < 1)
      throw new AccountError("至少需轉出一元", this);  
    else
      balance -= money + 10;
  }

  public long checkBalance() { return balance; }  // 傳回餘額
}

public class Pgm1410 {

  public static void main(String[] argv) throws IOException {

    System.out.println("簡單帳戶模擬計算");
    System.out.print("開戶要存多少錢→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    try {
      Account myAccount = new Account(Integer.parseInt(str));
      while (true) { // 處理的迴圈
        System.out.print("\n您現在要(1)存款(2)提款(3)轉帳→");
        str = br.readLine();
        int choice = Integer.parseInt(str);
        System.out.print("請輸入金額→");
        str = br.readLine();
        int money = Integer.parseInt(str);

        switch (choice) {
          case 1:               // 存款處理
             myAccount.deposite(money);
             System.out.print("存了" + money + " 元後, 帳戶還剩 ");
             System.out.println(myAccount.checkBalance() + " 元");
             break;
          case 2:               // 提款處理
             myAccount.withdraw(money);
             System.out.print("領了" + money + " 元後, 帳戶還剩 ");
             System.out.println(myAccount.checkBalance() + " 元");
             break;
          case 3:               // 轉帳處理
             System.out.print("請輸入對方帳號→"); // 此輸入動作僅為模擬
             str = br.readLine();                  // 程式中未使用此輸入資料

             myAccount.transfer(money);
             System.out.print("轉出" + money + " 元、手續費十元, 帳戶還剩 ");
             System.out.println(myAccount.checkBalance() + " 元");
        }
      }
    }
    catch (AccountError e) {
      System.out.println(e);
    }
    catch (NumberFormatException e) { // 捕捉輸入格式錯誤的例外
      System.out.println("輸入錯誤, "+e);
    }
  }
}
