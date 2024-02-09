package single_creation;
// import java.util.*;
import java.util.Scanner;

public class single_creation
 {
    static class Node{                //node ka structure / class to declare a node
            int data;
            Node next;
            Node (int data)                //constructor
            {
                this .data=data;
                this.next =null;
            }
         }
         Node head=null;             //initial value of head =null

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
        }   
        else                                 // if linked list exist
        {
             //new_node.next=head;                  //new node  next me 1st node ka address jo head me hai vo aayega
             //head=new_node;                       //new node a address head me jayega
            System.out.println("Enter data to insert the data in the begining , 2 to insert the data ata the end , 3 to insert tht data at specific position ");  
            m=sc.nextInt();
            switch(m)
            {
                case 1:                 //insert the data in the begining of LL         
                          new_node.next=head;
                          head=new_node;
                break;

                case 2: 
                        Node temp= head;
                        while (temp.next!= null)
                        {
                            temp=temp.next;
                        }
                        temp.next=new_node;

                  break;

                  case 3:
                         System.out.println("Enter position of node to be entered :");
                         p=sc.nextInt();
                         Node temp1=head;
                         for (int i=0;i<(p-1);i++)
                         {
                            temp1 = temp1.next;
                         }  
                         new_node.next=temp1.next;
                         temp1.next=new_node;
                  break;
            }
        }   
        System.out.println("Do you want to add more data. If yes , press:1 ");  
        n=sc.nextInt();
    }                                            //do close
      while(n==1);

    } 

    public void delete()
    {
         int data ,n, m , p;
         Node ptr;
        Scanner sc = new Scanner (System.in);
        
        do{
            if (head==null)
            {
                 System.out.println("Linked List is empty:");
            }
            
        else                                
        {            
            System.out.println("Enter 1 to delete the item from begining , 2 to delete the item from end , 3 to delete the item from specific position ");  
            m=sc.nextInt();
            switch(m)
            {
                case 1:                       //delete from begining
                        Node temp=head;
                        temp=temp.next;
                        head=temp;       
                break;

                case 2: 
                        Node temp1=head;
                        Node ptr=temp1.next;
                        while(ptr.next!=null)
                        {
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=null;

                  break;

                  case 3:
                         System.out.println("Enter position of node to be deleted :");
                         p=sc.nextInt();
                        Node temp2=head;
                        Node ptr1=temp2.next;
                        for (int i=0;i<p-2;i++)
                        {
                            temp2=ptr;
                            ptr=ptr.next;
                        }
                        temp2.next=ptr.next;
                  break;
            }
        }   
        System.out.println("Do you want to delete more data. If yes , press:1 ");  
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
             while(temp!=null)
             {
                System.out.print(temp.data + " ");
                temp=temp.next;
             }
        }
    }

    public static void main(String[] args) 
    {
        single_creation ll = new single_creation();
        ll.creation();
        ll. delete();
        ll.traverser();

    }
    
}
