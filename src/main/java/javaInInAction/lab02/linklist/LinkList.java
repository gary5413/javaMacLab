package javaInInAction.lab02.linklist;

import javaInInAction.lab02.List;

public class LinkList implements List {
    /**
     * 定義一個內部類Node 代表單練表節點
     */
    private class Node {
        /**
         * 保存單練表的節點數據
         */
        private Object data;
        /**
         * 指向下一個節點的引用
         */
        private Node next;

        /**
         * Node 無建構子
         */
        public Node() {

        }

        /**
         * @param element 節點數據
         * @param next    指向下一個節點引用
         */
        public Node(Object element, Node next) {
            this.data = element;
            this.next = next;
        }
    }

    /**
     * 單練表頭節點
     */
    private Node header;
    /**
     * 單練表尾節點
     */
    private Node tail;
    /**
     * 單練表長度
     */
    private int size;

    /**
     * 單練表無參數限構子
     */
    public LinkList() {
        header = null;
        tail = null;
    }

    public LinkList(Object element) {
        header = new Node(element, null);
//        只有一個節點,header tail 都指向該節點
        tail = header;
        size++;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size ==0;
    }

    /**
     *
     * @param index 位置
     * @param element 元素
     */
    @Override
    public void insert(int index, Object element) {
        if(index <0 || index >size){
            throw new RuntimeException("索引超出單練表範圍");
        }
        //
        if(header == null){
            add(element);
            return;
        }
        if(index ==0){
            addAtHead(element);
        }
    }
    private void addAtHead(Object element){
        Node newNode = new Node(element, null);
        newNode.next=header;
        header=newNode;
        if(tail==null){
            tail=header;
        }
        size++;
    }
    private void add(Object element){
        if(header ==null){
            header=new Node(element,null);
            tail=header;
        }else{
            Node newNode = new Node(element, null);
            tail.next=newNode;
            tail=newNode;
        }
        size++;

    }

    /**
     *
     * @param index 位置
     */
    @Override
    public void delete(int index) {
       if(index <0 || index> size-1){
           throw new IndexOutOfBoundsException("索引超出單鏈範圍");
       }
       Node del;
       if(index ==0){
           header=header.next;
           size--;
           return;
       }
       Node prev=findByIndex(index-1);
       del=prev.next;
       prev.next=del.next;
       del.next=null;
       size--;
    }

    /**
     *
     * @param index 位置
     * @return 元素
     */
    @Override
    public Object get(int index) {
        Node node=findByIndex(index);
        if(node!=null){
            return node.data;
        }
        return null;
    }

    private Node findByIndex(int index){
        if(index <0 || index >size-1){
            throw new RuntimeException("索引超出單鏈表範圍");
        }
        Node current=header;
        for(int i=0;i<size && current !=null;i++,current=current.next){
            if(i==index){
                return current;
            }
        }
        return null;
    }
}
