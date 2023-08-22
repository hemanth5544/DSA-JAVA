public class LinkedList{

    private head;
    private tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }

    public insertFirst(int val){
        Node node =new.Node(val);
        node.next=head;
        head=head;
        if(tail==null){
            tail=head;

        }
size +=1 ;
    }

    private class Node
    {
        
        int val;
        Node next;//node is a box of array valt is item in box 
        Node(int value){ //constructor to define value
        this.value=int value;
       }
       public Node(int value, Node next)
       {
        this.value=value;
        this.next=next;
       }

    }
}