package javaFlag.javaFlagLab12.interfaceLab7;

public class ActionSorting {
    public static void main(String[] argv){
        Land[] lands={
                new Circle(5),
                new Square(4),
                new Circle(3),
                new Square(7)
        };
        for(Land l:lands){
            System.out.println(l);
        }
        Sort.bubbleSort(lands);
        System.out.println("after sorting");
        for(Land l:lands){
            System.out.println(l);
        }
    }
}
