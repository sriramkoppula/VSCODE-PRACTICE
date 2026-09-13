    import java.util.Scanner;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    class LinkedList{
        Node head;
        Node tail;
        public void insert(int data){
            Node n=new Node(data);
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                tail=n;
            }
        }
        public void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                if(temp.next!=null){
                    System.out.print("--> ");
                }
                temp=temp.next;
            }
            System.out.print("--> null");
        }
    }
    class Traversal{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      LinkedList l=new LinkedList();
      for(int i=0;i<n;i++){
        int x=sc.nextInt();
        l.insert(x);
      }
      l.print();
    }
}