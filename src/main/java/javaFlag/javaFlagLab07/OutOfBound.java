package javaFlag.javaFlagLab07;

public class OutOfBound {
    public static void main(String[] argv){
        int[] a;
        a=new int[4];
        a[1]=10;
        a[2]=10;
        a[3]=10;
        a[4]=10; //0 1 2 3 沒有4
    for(int i=0;i<=a.length;i++){
        System.out.println("a["+i+"]:"+a[i]);
    }
    }
}
