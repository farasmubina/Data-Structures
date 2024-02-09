//2nd time enterkrte time arrayIndexOutOfBound error aa raha hai ...check it!

import java.util.Scanner;           

class cirqueue1 {

        int f=-1,r=-1;
        int n=10;
        int q[]=new int [n];

    public void enqueue(Scanner sc){
       if (f==(n-1)%n) {
        System.out.println("Overflow");   
       }
       else{
        System.out.println("enter data");
        int i=sc.nextInt();
        if(f==-1 && r==-1){
            f=0;
            r=0;
            q[r]=i;
        }
        else{
            r=(r+1)%n;                   //n = max size
            q[i]=i;
        }
    }
    }

    public void dequeue(){
        if (f==-1 && r==-1){
            System.out.println("underflow");
        }
        else if(f==r){                            //when there is only one element in the queue
         System.out.println("underflow");   
         f=-1;
        }
        else{
            f=(f+1)%n;
        } 
        
    }

    public void display(){
        int i;
        System.out.println("items are:");
        for (i=f;i!=r;i=(i+1)%n){
            System.out.println(q[i]);       //jab i ki value same ho jati hai tab vo lop se bahar aa jata hai
        }
        System.out.println(q[i]);        // last ka ek element se phele hi loop out ho jata hai isliye alag se print krwana padega jidhar i ki value same hai vo element print karwane k liye
    }
}


public class cir_queue_arr {
        public static void main(String[] args) 
    {
        int d;
        Scanner sc =new Scanner(System.in);
        cirqueue1 e = new cirqueue1();
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
                    e.enqueue(sc);
                    break;
                }

                case 2:
                {
                     e.dequeue();
                     break;
                }
                case 3:
                {

                    e.display();
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
