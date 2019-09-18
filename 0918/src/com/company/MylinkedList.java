package com.company;

import sun.awt.geom.AreaOp;

class Node{
    int val;
    Node next = null;
    Node prev = null;

    public Node(int val) {
        this.val = val;
    }
}

public class MylinkedList {
    private  Node head = null;
    private  Node last = null;
    private int size = 0;

    public void pushFront(int val){

        Node node = new Node(val);
        node.next = head;
       if(head != null) {
           head.prev = node;
       }else{
           last = node;
       }
        head = node;

        size++;
    }
    public void popFront(){
        if(size <= 0){
            System.out.println("无法对空链表进行删除");
            return;
        }
        if(head.next == null){
            head = null;
            last = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    void pushBack(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            last = node;
            size++;
            return;
        }
        last.next = node;
        node.prev = last;
        last = node;
        size++;
    }
    void popBack(){
        if(size <= 0){
            System.out.println("无法对空链表进行删除");
            return;
        }

        last = last.prev;
        if(last != null){
        last.next = null;
        }else {
            head = null;
        }
        size--;
    }
    public void pushAfter(int index,int val){

        if(index<0 || index>size){
            System.out.println("给定下标错误");
            return;
        }
        if(index == 0){
            pushFront(val);
        }
        else if (index == size){
            pushBack(val);
        }else {
            Node pos;
            int backwardIndex = size - index -1;
        }
        if(index <= backwardIndex){
            pos = head;
            for(int i = 0;i<index;i++){
                pos = pos.next;
            }else{
                pos = last;
                for(int i = 0;i<backwardIndex)
            }
        }

    }
    private Node getNode(int index){
        if()
    }
    public void popAfter(int index){
        if(index<0 || index>size){
            System.out.println("给定下标错误");
            return;
        }
        if(index == 0){
            popFront();
        }else if(index == size-1){
            popBack();
        }else {
            if(index <= backwardIndex){
                for(int i = 0;i<index;i++) {
                    index
                }
            }
            else{
                pos = last;
                for(int i = 0;i<backwardIndex)
            }
            size--;
        }
    }
}
