package javaFlag.javaFlagLab09;

class IcCard{
    private long id;
    private int money;
    public void showInfo(){
        System.out.println("卡號"+id);
        System.out.println(money+"元");
    }
    public Boolean add(int value){
        if(value>0 && value+money <=10000){
            money+=value;
            return true;
        }
        return false;
    }
    public IcCard(long id,int money){
        this.money=money;
        this.id=id;
    }
    public IcCard(long id){
        this(id,0);
    }
}
public class TestCard {
    public static void main(String[] argv){
        IcCard card1 = new IcCard(001, 500);
        IcCard card2 = new IcCard((002));
        System.out.println("加值500"+(card1.add(500)?"成功":"失敗"));
        card1.showInfo();

        System.out.println("加值9999"+(card2.add(9999)?"成功":"失敗"));
        card2.showInfo();
    }
}
