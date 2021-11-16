package javaFlag.javaFlagLab12;

interface Face{
    void smile();
}
public class LambdaFace {
    public static void main(String[] argv){
        Face c = () -> System.out.println("^_^");
        c.smile();
    }
}
