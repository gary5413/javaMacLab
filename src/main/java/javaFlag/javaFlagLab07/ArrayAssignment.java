package javaFlag.javaFlagLab07;

public class ArrayAssignment {
    public static void main(String[] argv){
        int[] a={20,30,40};
        int[] b=a;
        b[2]=100;
        System.out.println("陣列a的元素:");
        for(int i:a){
            System.out.println("\t"+i);
        }
        System.out.println("陣列b的元素：");
        for(int i:b){
            System.out.println("\t"+i);
        }
    }
}
