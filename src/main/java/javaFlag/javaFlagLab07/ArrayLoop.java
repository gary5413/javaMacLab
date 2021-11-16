package javaFlag.javaFlagLab07;

public class ArrayLoop {
    public static void main(String[] argv){
        double[] students={60,70,80,90};
        double sum=0;
        for(double score:students){
            sum+=score;
        }
        double average=sum/students.length;
        System.out.println("平均成績："+average);
    }
}
