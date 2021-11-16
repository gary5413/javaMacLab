package javaInInAction.lab02.sequenceList;

import javaInInAction.lab02.List;

public class SequenceList implements List {

    /*
     * 順序表的容量
     */
    private int maxSize;
    /*
     * 順序表的長度
     */
    private int length;
    /*
     * 一個數組來存放數據
     */
    private Object[] list;

    public SequenceList(int size) {
        if (size <= 0) {
            throw new RuntimeException("順序表容量異常");
        }
        this.maxSize = size;
        this.length = 0;
        this.list = new Object[size];
    }

    /**
     * 默認構造函數
     */
    public SequenceList() {
        this(10);
    }

    /**
     *
     */
    @Override
    public int size() {
        return this.length;
    }

    /**
     *
     */
    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     *
     */
    @Override
    public void insert(int index, Object object) {
        if (length == maxSize) {
            throw new RuntimeException("順序表已滿 無法插入");
        }
        // 插入位置編號是否合法
        if (index < 0 || index > maxSize) {
            throw new RuntimeException("參數錯誤");
        }
        for (int i = length - 1; i >= index; i--) {
            list[i + 1] = list[i];
        }
        list[index] = object;
        length++;
    }

    /**
     * @param index 位置
     */
    @Override
    public void delete(int index) {
        if (isEmpty()) {
            throw new RuntimeException("順序為空 無法刪除");
        }
        if (index < 0 || index > maxSize - 1) {
            throw new RuntimeException("參數錯誤");
        }
        //移動index 位置後的元素
        for (int i = index; i < length - 1; i++) {
            list[i] = list[i + 1];
        }
        length--;

    }

    /**
     * @param index 位置
     * @return 元素
     */
    @Override
    public Object get(int index) {
        if (index < 0 || index >= maxSize) {
            throw new RuntimeException("參數錯誤");
        }
        return list[index];
    }

}


