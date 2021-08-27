package com.xiong.study.linkedList;

public class SinglyLinkedList {


    private Node head = null;


    //无头节点
    //表头插入
    //这种操作用于将输入的顺序相反，逆序
    public void insertToHead(int value){
        Node newNode = new Node(value ,null);
        insertToHead(newNode);
    }


    public void insertToHead(Node newNode){
        if(head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertTail(int value){
        Node newNode = new Node(value, null);
        if(head == null){
            head = newNode;
        } else {
            Node q = head;
            while (q.next != null){
                q = q.next;
            }
            newNode.next = q.next;
            q.next = newNode;
        }

    }

    public void printAll(){
        Node p = head;
        while (p !=null ){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static class Node{
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        public int getData(){
            return data;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        int data[] = {1,2,5,3,1};
        for(int i =0; i<data.length; i++){
            singlyLinkedList.insertTail(data[i]);
        }

        System.out.println("打印原始：");
        singlyLinkedList.printAll();
        System.out.println("switch master");
        System.out.println("test notify");

    }
}
