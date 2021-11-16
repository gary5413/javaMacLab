package javaFlag.javaFlagLab11;

class Cylinder extends Circle {
    private double h;

//    新增一個計算體積的方法  因為r變數 改為 protected 可以直接存取
    public double volume(){
        return r * r * 3.14 * h;
    }
    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r); //呼叫父類別的建構方法
        this.h = h;
    }

    public Cylinder() {
        System.out.println("...正在執行 Ｃylinder() 建構方法");
    }
}
