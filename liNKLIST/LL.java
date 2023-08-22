package liNKLIST;
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node=new Node(val);//creating a new box with node with val

        node.next=head;//point that value to the present head with head
        head=node;//updating the new head with our node
        if(tail==null){ //if it has only one elemment
            tail=head;
        }
        size++;

    }

    public void display(){
        Node temp=head;//refering temp to head to displar
            while(temp!=null){
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            }

    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
