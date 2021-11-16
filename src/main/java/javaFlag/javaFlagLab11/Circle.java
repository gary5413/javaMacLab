package javaFlag.javaFlagLab11;

class Circle{
    private double x,y;
//    private double r;
    protected double r;
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void setCenter(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void setRadius(double r){
        this.r=r;
    }
    public String toString(){
        return "圓心:("+x+","+y+"),半徑："+r;
    }

    public Circle() {
        System.out.println("...正在執行 Ｃircle() 建構方法");
    }
}
