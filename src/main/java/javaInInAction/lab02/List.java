package javaInInAction.lab02;

public interface List {

        /**
         * 查詢線性表長度
         * @return 線性表長度
         */
        int size();
        /**
         * 判斷線性表是否為空
         * @return ture or false
         */
        boolean isEmpty();
        /**
         *
         * @param index 位置
         * @param object 元素
         */
        void insert(int index, Object object);

        /**
         *
         * @param index 位置
         */
        void delete(int index);

        /**
         *
         * @param index 位置
         * @return 元素
         */
        Object get(int index);

    }



