import java.util.Scanner;

import javafx.scene.effect.Light.Spot;

    class queue_1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    Node f= null;
    Node r=null;

    public void enqueue(Scanner sc){
        System.out.println("Enter data");
        int data = sc.nextInt();
        Node new_node=new Node(data);
        if(f==null){
            f=new_node;
            r=new_node;
        }
        else{
            r.next=new_node;                 //end me node hoga
            r=new_node;
        }

    }

    public void dequeue(){
        if(f==null){
            System.out.println("underflow");
        }
        else{
            f=f.next;
        }

    }

    public void display(){
        Node temp=f;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next; 
        }
    }
}

public class queue_ll{
    public static void main (String args []){
        int d;
        Scanner sc =new Scanner(System.in);
        queue_1 q = new queue_1();
        int l;
        do{
            System.out.println("PRESS 1 TO enqueue");
            System.out.println("PRESS 2 TO dequeue");
            System.out.println("PRESS 3 TO display");
            System.out.println("Enter your choise");
            d= sc.nextInt();
            switch (d) {
                case 1:
                {
                    q.enqueue(sc);
                    break;
                }

                case 2:
                {
                     q.dequeue();
                     break;
                }
                case 3:
                {

                    q.display();
                    break;
                }
                // default:
                //     break;
            }
            System.out.println("ENTER 0 TO GO BACK TO THE MAIN MENU");
            System.out.println("ENTER ANY KEY TO EXIT");
            l=sc.nextInt();
        }
        while(l==0);
        System.out.println("EXIT SUCCESSFULL!");

    }

}

