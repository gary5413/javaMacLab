package javaFlag.javaFlagLab11.polymorphism;

public class ActionLand {
    public static void main(String[] argv){
        Circle c = new Circle(5);
        Square sq = new Square(5);
        Calculator calculator = new Calculator(3000);
//        System.out.println(calculator.calculatePrice(c));
//        System.out.println(calculator.calculatePrice(sq));
//        System.out.println(calculator.CalculatorAll(new Land[] {c,sq}));
//        System.out.println(calculator.CalculatorAll(c,sq));
//
//        System.out.println(Calculator.calPrice(4000,c));
//        System.out.println(Calculator.calPrice(4000,c,sq));

        System.out.println(Calculator.calPriceObject(3000,c,2,sq));
    }
}
