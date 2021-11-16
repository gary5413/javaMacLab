package javaFlag.javaFlagLab11.lab11_2;

class Parent{
    void show(){
        System.out.println("父類別");
    }
}
class Child extends Parent{

    void show(String str) {
        System.out.println(str);
    }
}
public class Method {
    public static void main(String[] argv){
        Child c = new Child();
        c.show();
        c.show("子類別");
    }
}
