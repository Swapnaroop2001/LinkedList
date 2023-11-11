/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
    Node head;

    /**
     * Node
     */
    public static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public void addNode(DoublyLinkedList l ,int d) {
        Node new_Node=new Node(d);
        if (head==null) {
            head=new_Node;
        }else{
            Node currn=head;
            while (currn.next!=null) {
                currn.prev=currn;
                currn=currn.next;
            }
            currn.next=new_Node;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=null;

        System.out.println(a.next.next.prev.data);


    }

}