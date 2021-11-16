package javaInInAction.lab04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 創建一個ArrayList中的元素
        ArrayList<Integer> arrayList = new ArrayList<>();
        //元素個數
        int size=10;
        //初始化arrayList元素
        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        //調用有參
        ArrayList<Integer> otherList = new ArrayList(arrayList);
        System.out.printf("arrayList 第0個位置元素是：%s%n ",arrayList.get(0));
        System.out.printf("arrayList 第5個位置元素是：%s%n ",arrayList.get(5));
        System.out.printf("arrayList 是否包含元素10：%s%n ",arrayList.contains(10));
        System.out.printf("arrayList 刪除第0個位置的元素：%s%n ",arrayList.remove(0));

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.printf("iterator()迭代器輸出arrayList元素：%s%n ",element);
            if(element==5){
                iterator.remove();
                System.out.printf("iterator()迭代器刪除arrayList元素：%s%n ",element);
                break;
            }
        }
        iterator.forEachRemaining(integer -> System.out.printf("forEachRemaining()輸出arrayList元素：%s%n ",integer));
        //刪除與arrayList交集部分
        otherList.removeAll(arrayList);
        //通過forEach方打迭代
        otherList.forEach(integer -> System.out.printf("forEach()方法輸出otherList元素：%s%n ",integer));

    }
}
