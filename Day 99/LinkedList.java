public class LinkedList {
     public static class Node{
        int data;
        int next;

        public  Node(int data){
             this.data = data;
             this.next = null;
        }
     }
     public static Node head;
     public static Node tail;

     public void addFirst(int data){
        //Step1 - Create new node;
        Node newNode = new Node(data);

        //step2 - new node's next = head
        newNode.next = head;

        //step3 - head = new node
        head = newNode
     }
     public static void main(String[] args) {
         LinkedList ll = new LinkedList();
         ll.head = new Node(1);
         ll.head.next = new Node(2);
     }
}
