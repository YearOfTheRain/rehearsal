package com.mine.callback;

/**
 * @program: rehearsal
 * @description: 一个节点
 * @author: LiShuLin
 * @create: 2019-07-12 16:04
 **/
public class Node {
    String name;
    String value;
    Node previous;
    Node next;

    public Node(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void buildNode(Node previous,Node next){
        this.previous = previous;
        this.next = next;
    }

    @Override
    public String toString() {
        String previousName = previous!=null?previous.toString():"没有值";
        String nextName = next!=null?next.toString():"没有值";
        return "Node{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", previous=" + previousName +
                ", next=" + nextName +
                '}';
    }
}
