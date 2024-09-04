import java.util.Scanner;

public class StackUsingLL {
    private class SLLNode{
        int data;
        SLLNode next;

        SLLNode (int data){
            this.data = data;
            this.next = null;
        }
    }

    SLLNode top = null;
    SLLNode tail = null;

    private void push(int data){
        SLLNode newNode = new SLLNode(data);

        if (top == null){
            top = newNode;
            tail = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    private void peek(){
        SLLNode curr = top;
        if (top == null){
            System.out.println("STACK IS EMPTY");
            return;
        }
        else{
            while(curr != null){
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }

    private void pop() {
        int data = 0;
        if (top == null){
            System.out.println("EMPTY STACK");
            return;
        }
        else{
            data = top.data;
            System.out.println(data+" Popped out.");
            top = top.next;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StackUsingLL s = new StackUsingLL();
        System.out.println("**** S T A C K ****");
        while(true){
            System.out.println("************************************");
            System.out.println("1. PUSH\n2. POP\n3. PEEK\n4. EXIT");
            System.out.println("ENTER YOUR CHOICE:\n");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter data : ");
                    int data = sc.nextInt();
                    s.push(data);
                    break;
                case 2:s.pop(); break;
                case 3:s.peek(); break;
                default: System.exit(0);  break;
            }
        }
    }
}
