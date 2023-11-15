/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
    Node head;
    Node tail;

    /**
     * Node
     */
    public static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addNode(DoublyLinkedList l, int d) {
        Node new_Node = new Node(d);
        if (head == null) {
            head=new_Node;
            tail=new_Node;
        } else {
            tail= head;
            while (tail.next!=null) {
                tail=tail.next;
            }
            tail.next=new_Node;
            new_Node.prev=tail;
            tail=new_Node;
        }
    }

    public void findLentgh(Node head) {
        int count = 1;
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node currn = head;
            while (currn.next != null) {
                count += 1;
                currn = currn.next;
            }
            System.out.println(count);
        }
    }

    public void getNthNode(int n) {
        if (head==null) {
            return;
        }
        if (n==1) {
            System.out.println(head.data);
        }
        else{
            int count=1;
            Node curNode=head;
            while (count<=n-1) {
                curNode=curNode.next;
                count+=1;
            }
            System.out.println(curNode.data);
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

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.addNode(l, 10);
        l.addNode(l, 20);
        l.addNode(l, 30);
        l.addNode(l, 40);
        l.addNode(l, 50);
        l.addNode(l, 60);
        l.addNode(l, 70);

        
       
        
        l.getNthNode(7);

    }

}

