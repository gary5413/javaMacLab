package javaFlag.javaFlagLab07;

public class NewArray {
    public static void main(String[] argv){
        int[] a={20,30,40};
        System.out.println("陣列a:");
        for(int i:a){
            System.out.println("\t"+i);
        }
        a=new int[5];
        a[0]=100;
        a[1]=200;

        System.out.println("\n重新配置陣列a:");
        for(int i:a){
            System.out.println("\t"+i);
        }

    }
}
