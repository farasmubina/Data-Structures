import java.util.Scanner;

public class tree_traversal {
    static Node create()
    {
    Scanner sc= new Scanner (System.in);
    Node root = null;
    System.out.println("Enter value: ");
    int data=sc.nextInt();
    if (data==-1)             // jab left wala chiled nhi ho toh -1 type kr ke vo function se bahar aa jayenge
        return null;
    root=new Node(data);
    System.out.println("Enter the left child of "+ root.data);
    root.left=create();
    System.out.println("Enter the right child of "+ root.data);
    root.right=create();
    return root;
    }

    static void inorder(Node root)       //LNR
    {
        if (root==null)
        return;
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    } 

    static void preorder(Node root)       //NLR
    {
        if (root==null)
        return;
        System.out.println(root.data + " ");
        preorder(root.left);
    } 

    static void postorder(Node root)       //LRN
    {
        if (root==null)
        return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    } 

    public static void main(String args[])
    {
    Node root=create();
    preorder(root);
    System.out.println();
    postorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    }
    
}

class Node
{
    Node left,right;
    int data;
    public Node (int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}