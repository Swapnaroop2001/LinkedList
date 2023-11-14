// /**
//  * DoublyLinkedList
//  */
// public class DoublyLinkedList {
//     Node head;

//     /**
//      * Node
//      */
//     public static class Node {
//         Node prev;
//         int data;
//         Node next;

//         Node(int data){
//             this.data=data;
//             this.prev=null;
//             this.next=null;
//         }
//     }

//     public void addNode(DoublyLinkedList l ,int d) {
//         Node new_Node=new Node(d);
//         if (head==null) {
//             head=new_Node;
//         }else{
//             Node currn=head;
//             while (currn.next!=null) {
//                 currn.prev=currn;
//                 currn=currn.next;
//             }
//             currn.next=new_Node;
//         }
//     }

//     public void findLentgh(Node head) {
//         int count=1;
//         if(head==null){
//             System.out.println("LinkedList is empty");
//         }
//         else{
//             Node currn=head;
//             while(currn.next!=null){
//                 count+=1;
//                 currn=currn.next;
//             }
//             System.out.println(count);
//         }
//     }

//     public void getNthNode(int n) {
//         if (head) {

//         }
//     }
//     public static void main(String[] args) {
//         Node a=new Node(10);
//         Node b=new Node(20);
//         Node c=new Node(30);
//         Node d=new Node(40);

//         a.prev=null;
//         a.next=b;
//         b.prev=a;
//         b.next=c;
//         c.prev=b;
//         c.next=d;
//         d.prev=c;
//         d.next=null;

//         System.out.println(a.next.next.prev.data);
//         DoublyLinkedList l=new DoublyLinkedList();
//         l.addNode(l, 10);
//         l.addNode(l, 20);
//         l.addNode(l, 30);
//         l.addNode(l, 40);
//         l.addNode(l, 50);
//         l.addNode(l, 60);
//         l.addNode(l, 70);

//         l.findLentgh(l.head);

//     }

// }

/**
 * DoublyLinkedList
 */

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
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

}}
