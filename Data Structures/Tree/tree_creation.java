
import java.util.Scanner;
public class tree_creation
{
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

    public static void main(String args[])
    {
    Node root=create();
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