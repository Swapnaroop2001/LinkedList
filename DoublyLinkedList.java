/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
    Node head;

    /**
     * Node
     */
    public class Node {
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
        DoublyLinkedList l=new DoublyLinkedList();
        l.addNode(l, 1);
        l.addNode(l, 2);
        l.addNode(l, 3);
        l.addNode(l, 4);
        System.out.println(l.head.next.next.next.data);
    }

}