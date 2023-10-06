package com.fedex.springdemo.Interview.LinkedList;

public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }

    class Node {
        Integer data;
        Node next;


        Node(Integer data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add First

    public void addFirst(Integer data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(Integer data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=null;
    }
    public void printList(){
        Node currNode=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+ " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            System.out.println("List has only one element");
            return;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }
    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null && head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        //Disconnecting first contact
        head.next=null;
        head=prevNode;
    }

    //add last
    public static void main(String args[]){
        LL list=new LL();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.printList();

        System.out.println("Size "+ list.getSize());
        list.reverseIterate();
        list.printList();
    }
}
