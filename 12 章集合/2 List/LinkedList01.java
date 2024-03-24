package 集合.List_;/*
 *@author yang
 */

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node yang = new Node("yang");
        //连接三个节点，形成双向链表
        jack.next = tom;
        tom.next = yang;

        yang.pre = tom;
        tom.pre = jack;

        Node first = jack; //让first引用指向jack，就是双向链表的头结点
        Node last = yang; //尾节点

//        while(true) {
//            if (first == null) {
//                break;
//            }
//            System.out.println(first);
//            first = first.next;
//
//            System.out.println(last);
//            last = last.pre;
//        }

        Node smith = new Node("smith");
        //把smith加入双向链表
        smith.next = yang;
        smith.pre = tom;
        yang.pre = smith;
        tom.next = smith;
        first = jack;
        last = smith;
        while(true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;

        }

    }
}
//定义一个Node类，Node对象表示双向链表的一个节点
class Node {
    public Object item; //真正存放数据的地方
    public Node next; //指向下一个节点
    public Node pre;  //指向前一个节点
    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name =" + item;
    }
}