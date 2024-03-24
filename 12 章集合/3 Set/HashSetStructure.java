package 集合.Set_;/*
 *@author yang
 */



public class HashSetStructure {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //模拟hashmap的底层
        //1 创建一个数组，数组类型是Node[]
        //2 Node[] 数组也可以称为表
        Node[] table = new Node[16];
        System.out.println(table);
        //3  创建结点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("Rose", null);
        jack.next = rose;

        Node lucy = new Node("lucy", null);
        table[3] = lucy;

        System.out.println(table);


    }
}

class Node { //结点，存储数据，可以指向下一个结点，从而形成链表
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}