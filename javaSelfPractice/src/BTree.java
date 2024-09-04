import java.util.Scanner;

public class BTree {
    class Node{
        Node left;
        int data;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node root = null;
    static Node cur = root;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the "+(i+1)+" element :");
            a[i] = sc.nextInt();
        }
        BTree B = new BTree();
        B.createTree(a);
        B.display();

    }

    void createTree(int a[]) {
        root = new Node (a[0]);
        for (int i = 1 ; i<a.length; i++){
            Node temp = new Node(a[i]);
             if (temp.data<root.data){
                 if (root.left == null){
                     root.left = temp;
                     cur = temp;
                 }

                 else if (temp.data<cur.data){
                     cur.left = temp;
                     cur = cur.left;
                 }

                 else if (temp.data> cur.data){
                     cur.right = temp;
                     cur = cur.right;
                 }
             }

            else if (temp.data>root.data){
                if (root.right == null){
                    root.right = temp;
                    cur = temp;
                }

                else if (temp.data<cur.data){
                    cur.left = temp;
                    cur = cur.left;
                }

                else if (temp.data> cur.data){
                    cur.right = temp;
                    cur = cur.right;
                }
            }
        }
        System.out.println("Tree created");

    }
    public void display() {
        System.out.println("In-Order-Traversal :");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Pre-Order-Traversal :");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("Post-Order-Traversal :");
        postOrderTraversal(root);

    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

}
