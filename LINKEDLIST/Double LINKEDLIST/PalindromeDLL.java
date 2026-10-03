import java.util.*;

class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class PalindromeDLL {

    static class LinkedList {

        Node head;
        Node tail;

        public void insert(int data) {

            Node n = new Node(data);

            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }

        public void method() {
            Node left=head;
            Node right=tail;
            while(left!=right && left.prev!=right){
              if(left.data!=right.data){
                System.out.print("Not a palindrome");
                return ;
              }
              left=left.next;
              right=right.prev;
            }
            System.out.print("Palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l = new LinkedList();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l.insert(x);
        }
        l.method();
    }
}