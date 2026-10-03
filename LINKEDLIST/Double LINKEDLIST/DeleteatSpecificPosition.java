import java.util.*;
class Node{
  int data;
  Node next;
  Node prev;
  Node(int data){
    this.data=data;
    this.next=null;
    this.prev=null;
  }
}
  class DeleteatSpecificPosition{
    static class LinkedList{
      Node head;
      Node tail;
      public void insert(int data){
        Node n=new Node(data);
        if(head==null){
          head=n;
          tail=n;
        }else{
          tail.next=n;
          n.prev=tail;
          tail=n;
        }
      }
      public void method(int a){
        Node temp=head;
        for(int i=0;i<a-1;i++){
          temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        
      }
      public void print(){
        Node temp=head;
        while(temp!=null){
          System.out.print(temp.data+" ");
          temp=temp.next;
        }
      }
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    LinkedList l=new LinkedList();
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      l.insert(x);
    }
    int a=sc.nextInt();
    l.method(a);
    l.print();
  }
}