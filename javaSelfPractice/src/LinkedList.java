import java.util.Scanner;
public class LinkedList {
     static int count = 0; // To keep the count of Nodes
class Node{
    int data;
    Node next; //bydefault it is Null
    Node (int data)
    {
        this.data = data;
        this.next = null;
    }
}


    Node head = null;
    Node tail = null;
    Scanner sc = new Scanner(System.in);

    public void insertFirst(){
        System.out.print("Enter the element: ");
        int data;
        data = sc.nextInt();
        Node n = new Node(data);
        if (head == null)
        {
            head = n;
            tail = n;
        }
        else{
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
    }
    public void insertLast(){
        System.out.print("Enter the element: ");
        int data;
        data = sc.nextInt();
        Node n = new Node(data);
        if (head == null)
        {
            head = n;
            tail = n;
        }
        else{
            tail.next=n;
            tail=tail.next;
        }

    }

    public void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        head = head.next;
        System.out.println("!!! DELETED FIRST NODE !!!");
    }

    public void deleteLast(){
        Node temp= head;
        Node prev = null;

        while (temp!=tail){
            prev = temp;
            temp = temp.next;
        }prev.next = null;
        System.out.println("!!! DELETED LAST NODE !!!");
    }

    public void sortAscending(){
        //Sorting
        Node n1 = head;
        Node n2 = head;
        int temp2 ;
        while(n1 != null )
        {
            n2 = n1.next;
            while(n2 != null)
            {
                if (n1.data > n2.data)
                {
                    temp2 = n1.data;
                    n1.data = n2.data;
                    n2.data = temp2;
                }
                n2 = n2.next;
            }
            n1 = n1.next;
        }
    }
    public void sortDescending(){
        //Sorting
        Node n1 = head;
        Node n2 = head;
        int temp2 ;
        while(n1 != null )
        {
            n2 = n1.next;
            while(n2 != null)
            {
                if (n1.data < n2.data)
                {
                    temp2 = n1.data;
                    n1.data = n2.data;
                    n2.data = temp2;
                }
                n2 = n2.next;
            }
            n1 = n1.next;
        }
    }

    public static void main(String args[]){
/*
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        Node head = p1;
        Node temp = head;

        System.out.println("Address of p1 : "+p1.hashCode());
        System.out.println("Address of p2 : "+p2.hashCode());
        System.out.println("Address of p3 : "+p3.hashCode());
        System.out.println("Address of p4 : "+p4.hashCode());

        while (temp != null)
        {
//            System.out.print(temp.data+" -> ");
            System.out.print(temp.data+"("+temp.hashCode()+")"+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
*/
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        System.out.println("**** LINKED LIST ****\n");
        while (true)
        {
            System.out.println("Enter your Choice : ");
            System.out.println("1. Insert at First\t2. Insert at Middle\t3. Insert at Last\n" +
                    "4. Delete from First\t5. Delete from Last\t6. Delete from Middle\n" +
                    "7. Display\n8. Sort Ascending\t9. Sort Descending\n10. Exit");

            int choice = sc.nextInt();
            switch(choice){
                case 1: //Insert at First
                    l.insertFirst();
                    count++;
                    break;
                    
                case 2:// Insert at Middle
                    if (count > 0) {
                        System.out.println("Choose the node number where you want to insert from (1 to " + count+")");
                        int pos2 = sc.nextInt();
                        if (pos2>count+1) break;
                        else l.insertMiddle(pos2);
                    }
                    count++;
                    break;

                case 3:// Insert at Last
                    l.insertLast();
                    count++;
                    break;

                case 4: //Delete from First
                    l.deleteFirst();
                    count--;
                    break;
                    
                case 5: //Delete from Last
                    l.deleteLast();
                    count--;
                    break;
                    
                case 6: //Delete from Middle
                    int pos;
                    if (count > 0) {
                        System.out.println("Choose the node number you want to delete from (1 to " + count+")");
                        pos = sc.nextInt();
                        l.deleteMiddle(pos);
                    }
                    count--;
                    break;
                case 7: //Display
                    l.display();
                    break;

                case 8: //Sort Ascending
                    l.sortAscending();
                    break;

                case 9: //Sort Descending
                    l.sortDescending();
                    break;

                default: System.exit(0);
            }
        }
    }

    private void deleteMiddle(int pos) {

        if (pos == 1)
            deleteFirst();
        else if (pos == count)
            deleteLast();
        else if(count == 2){
            Node temp = head;
            temp.next.next = null;
            System.out.println("!!! DELETED NODE " + pos + " !!!");
        }
        else {
            Node temp = head;
            for (int i = 2; i < pos; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.next = null;
            System.out.println("!!! DELETED NODE " + pos + " !!!");
        }
    }

    private void insertMiddle(int pos) {

        if(pos == 1)
            insertFirst();

        else {
            System.out.print("Enter the element: ");
            int data;
            data = sc.nextInt();
            Node temp  = new Node(data);
            Node currPos = head;
            for (int i=2; i<pos; i++){
                currPos = currPos.next;
            }
            temp.next = currPos.next;
            currPos.next = temp;
        }
    }
}