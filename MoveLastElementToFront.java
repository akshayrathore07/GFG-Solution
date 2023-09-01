// Input: 1->2->3->4->5
//Output: 5->1->2->3->4

public class MoveLastElementToFront {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head ){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node moveLastElement(Node head) {
        if (head == null || head.next == null) {
            return head; // No need to move if the list is empty or has only one element
        }

        Node temp = head;
        Node prev = null;

        // Traverse to the last node and keep track of the previous node
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        // Update pointers to move the last node to the front
        prev.next = null;
        temp.next = head;
        head = temp;

        return head; // Return the new head
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

       Node newHead = moveLastElement(a);
      display(newHead);

    }
}
