package javaFlag.javaFlagLab07;

public class ArrayAverage {
    public static void main(String[] argv){

        double [] students;//宣告陣列
        students=new double[5];//配置陣列


/*
        double[] studnets1=new double[5];// 同時宣告並配置

//      使用變數和運算式
        int i=4,j=8;
        int[] a=new int[i];
        int[] b=new int[j-i];

//      宣告並指派陣列內容
        double[] students2={70,65,90,85,95};

        int[] c={4,i,i+j};
 */

        students[0]=70;
        students[1]=71;
        students[2]=72;
        students[3]=73;
        students[4]=74;

        double sum=0;
        for(int i=0;i<students.length;i++){
            sum+=students[i];
        }
        double average=sum/ students.length;
        System.out.println("平均成績："+average);

    }
}
