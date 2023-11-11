import java.util.ArrayList;

/**
 * LinkedList
 */
public class LinkedList {
  Node head;

  /**
   * Node
   */
  public class Node {
    int data;
    Node next;

    Node(int val) {
      this.data = val;
      this.next = null;
    }
  }

  public void addNode(LinkedList l, int d) {
    if (l.head == null) {
      Node new_node = new Node(d);
      head = new_node;
    } else {
      Node curn = head;
      while (curn.next != null) {
        curn = curn.next;
      }
      Node new_node = new Node(d);
      curn.next = new_node;
    }
  }

  public void printLinkedlist(LinkedList l) {
    if (l.head == null) {
      System.out.println("Nothing to print");
    } else {
      Node curn = head;
      System.out.println(curn.data);
      while (curn.next != null) {
        System.out.println(curn.next.data);
        curn = curn.next;
      }
    }
  }

  // Find Length.
  public int findLength(LinkedList list) {
    if (list.head == null) {
      return 0;
    } else {
      int count = 1;
      Node curNode = head;
      while (curNode.next != null) {
        curNode = curNode.next;
        count = count + 1;
      }
      return count;
    }
  }

  // Find given element.
  public void findElement(Node head, int k) {
    int count = 1;
    int flag = 0;
    Node curNode = head;
    while (curNode.next != null) {
      curNode = curNode.next;
      count = count + 1;
    }
    Node n = head;
    for (int i = 0; i < count; i++) {
      if (n.data == k) {
        flag = 1;
      }
      n = n.next;
    }
    System.out.println(flag);
  }

  // Reverse LinkedList
  public int reverseLinkedlist(Node h) {
    Node prev = null;
    Node head = h;
    Node next = null;

    while (head != null) {
      next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev.data;
  }

  // Merge Two Sorted Lists.
  public void mergeTwoSortedList(LinkedList list1, LinkedList list2) {
    ArrayList<Integer> temp = new ArrayList<Integer>();
    int count = 1;
    Node head1 = list1.head;
    Node head2 = list2.head;
    Node curr = head1;
    while (curr.next != null) {
      curr = curr.next;
      count += 1;
    }
    while (head1 != null) {
      if (head1.data < head2.data) {
        temp.add(head1.data);
        temp.add(head2.data);
      } else {
        temp.add(head2.data);
        temp.add(head1.data);
      }
      head1 = head1.next;
      head2 = head2.next;
    }

    LinkedList ans = new LinkedList();
    for (int i = 0; i < temp.size(); i++) {
      ans.addNode(ans, temp.get(i));
    }
    ans.printLinkedlist(list2);
  }

  // Remove Nth Node from last.
  public void removeNthNodefromLast(Node head, int n) {
    Node curn = head;
    Node prev = null;
    Node next = null;
    while (curn != null) {
      next = curn.next;
      curn.next = prev;
      prev = curn;
      curn = next;
    }
    for (int i = 0; i < n; i++) {
      curn = curn.next;
    }
    curn.next = curn.next.next;
  }

  // Given head of linkedlist Calculate Decimal number from Binary number.
  public void converToDecimal(Node head) {
    Node currn = head;
    ArrayList<Integer> sum = new ArrayList<Integer>();
    while (currn != null) {
      sum.add(0, currn.data);
      currn = currn.next;
    }
    double decimalValue = 0;
    for (int i = 0; i < sum.size(); i++) {
      if (sum.get(i) == 1) {
        decimalValue += Math.pow(2, i);
      }
    }
    System.out.println(decimalValue);

  }

  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.addNode(l, 1);
    l.addNode(l, 1);
    l.addNode(l, 1);
    l.addNode(l, 1);

    l.converToDecimal(l.head);

  }
}