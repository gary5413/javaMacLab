package javaFlag.javaFlagLab11.polymorphism;

public class Calculator {
    double price;

    public Calculator(double price) {
        this.price = price;
    }
    double calculatePrice(Land l){
        return l.area() *price;
    }
    double CalculatorAll(Land... Lands){ //Varargs 傳遞不定數量參數
//    double CalculatorAll(Land[] Lands){
        double total=0;
        for(Land l:Lands){
            total+=calculatePrice(l);
        }
        return total;
    }
    static double calPrice(double price,Land... Lands){
        double total =0;
        for(Land l:Lands){
            total+=l.area()*price;
        }
        return total;
    }
    static double calPriceObject(double price,Object... objs){
        double total=0;
        double tmp=0;
        for(Object o:objs){
//          如果是土地物件
            if(o instanceof Land){
//              計算地價 儲存 tmp
                tmp=(((Land) o).area() * price);
                total+=tmp;
//                如果是數值
            }else if(o instanceof Integer) {
//                因之前tmp已加過一次 所以減1
                total += tmp * ((Integer) 0 - 1);
            }
        }
        return total;
    }
}
