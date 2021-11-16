package javaFlag.javaFlagLab09;

class Utility{
    public static int min(int[] data){
        int min=data[0];

        for(int i=1;i<data.length;i++){
            min=(min <=data[i]) ? min : data[i];
        }
        return min;
    }
    public static int max(int[] data){
        int max=data[0];
        for(int i=1;i<data.length;i++){
            max=(max >= data[i]) ? max :data[i];
        }
        return max;
    }
}
public class MinMax {
    public static void main(String[] argv){
        int[] data={1,2,3,4,5,6,7};
        System.out.println("max:"+Utility.max(data));
        System.out.println("min:"+Utility.min(data));
    }
}
