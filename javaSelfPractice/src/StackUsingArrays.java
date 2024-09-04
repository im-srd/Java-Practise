import java.util.Scanner;

public class StackUsingArrays {
    final int MAX_SIZE = 5;
    int stack[] = new int[MAX_SIZE];
    int top = -1;

    private void push(int data){
        if (top>=MAX_SIZE-1){
            System.out.println("\nSTACK OVERFLOW\n");
            return;
        }
        else
            stack[++top]=data;
    }

    private void pop(){
        if (top == -1){
            System.out.println("\nSTACK UNDERFLOW\n");
            return;
        }
        else
            System.out.println(stack[top--]+" Popped out.");
    }

    private void peek(){
        if (top == -1){
            System.out.println("\nEMPTY STACK\n");
            return;
        }
        else{
            for (int i=top;i>=0;i--) {
                System.out.println("|"+stack[i]+"|");
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StackUsingArrays s = new StackUsingArrays();
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
