package mylinkedlist;

public class MyLinkedList {
    private Node head;
 /*
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }



    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
*/



  /*

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
            linkedList.addLast(1);
            linkedList.addLast(2);
            linkedList.addLast(3);

*/


    public int length(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;

        }

        return count;

    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getData() + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }







    public void deleteFirst(){
        if(head == null)
            return;
        head = head.next;
    }



}




