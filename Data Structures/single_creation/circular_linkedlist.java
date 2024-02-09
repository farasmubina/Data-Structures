package single_creation;

import java.util.Scanner;

public class circular_linkedlist {
    static class Node{                //node ka structure / class to declare a node
        int data;
        Node next;
        Node (int data)                //constructor
        {
            this .data=data;
            this.next =null;
        }
     }
     Node head=null;             //initial value of head & tail =null
     Node tail=null;

      public void creation()
    {
        int data ,n, m , p;
        Scanner sc = new Scanner (System.in);
        
        do{
            System.out.println("Enter data:");

        data= sc.nextInt();
        
        Node new_node =new Node(data);          //jitne bhi new node banaye uska naam new node rakha aur constructor paas kiya
        
        if(head==null)                        //if linked list doesn't exist
        {
            head = new_node;              //  head me new node ka address aa jayega
            tail=new_node;
            new_node.next=head;
        }   
        else                                 // if linked list exist
        {
            new_node.next=head;
            head=new_node;
            tail.next=head;
        }   
        System.out.println("Do you want to add more data. If yes , press:1 ");  
        n=sc.nextInt();
    }                                            //do close
      while(n==1);

    } 

    public void traverser()
    {
        Node temp = head;            //initially temp head ko point krega 
        if(head==null)
        {
            System.out.println("Lined List does not exist");
        }
        else
        {
            do
            {
                 System.out.print(temp.data + " ");
                temp=temp.next;

            }
             while(temp!=head);
        }
    }
}

public static void main(String[] args) 
    {
        circular_linkedlist ll = new circular_linkedlist();
        ll.creation();
        ll.traverser();

    }
    
