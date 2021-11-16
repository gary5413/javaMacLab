package javaFlag.javaFlagLab09;

class Test7{
    private int x,y;

    public Test7(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class AccessMethod {
    public static void main(String[] argv){
        Test7 a = new Test7(30,40);
        a.setX(70);
        a.setY(70);

        System.out.println(a.getX());
        System.out.println(a.getX());
    }
}
