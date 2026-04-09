class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void insertAtStart(int data){
         Node newNode= new Node(data);
         newNode.next = head;
         head = newNode;

    }
    public void InsertAtEnd(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;

    }
    public void Display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data+"->");
        System.out.println("null");
    }
    public void deleteAtstart(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deleteAtEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtIndex(int t){
        if(t==0){
            deleteAtstart();
        }
        else{
            Node temp=head;
            int i=0;
            while(i<t-1){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
        }

    }
    public void Insertposition(int data,int t){
        Node newNode=new Node(data);
        if(t==0){
            insertAtStart(data);
        }
        else{
            Node temp=head;
            int i=0;
            while(i<t-1){
                temp=temp.next;
                i++;
            }
            temp.next=newNode;
        }

    }
}

public class Linked {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insertAtStart(2);
        list.insertAtStart(1);
        list.InsertAtEnd(5);
        list.Display();
        list.deleteAtIndex(0);
        list.Insertposition(10,2);
        list.Display();
    }
}
