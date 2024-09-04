package linkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head = null;

    // Insert new node at last
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else {
            Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                    }
                temp.next = newNode;
        }
    }

    // Display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print("|"+ temp.data + "|");
            temp = temp.next;
        }
    }
} 
public class Test {
    public static void main(String args[]){
    LinkedList list1 = new LinkedList();
    list1.insert(10);
    list1.insert(20);
    list1.insert(30);

    LinkedList list2 = new LinkedList();
    list2.insert(100);
    list2.insert(200);
    list2.insert(300);

    list1.display();
    System.out.println();
    list2.display();
    }
}
