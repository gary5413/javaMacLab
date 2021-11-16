package javaInInAction.lab02.sequenceList;

public class SequenceListDemo {
    public static void main(String[] args){
        /**
         * 線性表最大容量
         */
        int maxSize=15;
        SequenceList sequenceList = new SequenceList(maxSize);
        System.out.println("-------------向順序表新增元素----------------");
        //測試insert get size方法
        for(int i=0;i<maxSize;i++){
            sequenceList.insert(sequenceList.size(),i);
        }
        for(int i=0;i<sequenceList.size();i++){
            System.out.print(sequenceList.get(i)+" ");

        }
        System.out.println();
        System.out.println("-----------------測試順序表已滿--------------------");
        try{
            sequenceList.insert(0,100);

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        //測試delete
        sequenceList.delete(0);
        System.out.println("-------------------順序表是否為空-----------------------");
        System.out.println(sequenceList.isEmpty());
        System.out.println("----------------------順序表刪除元素後-----------------------------");
        for(int i=0;i<sequenceList.size();i++){
            System.out.print(sequenceList.get(i)+" ");
        }
    }
}
