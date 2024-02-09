import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class stack_col_frame {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        Stack<Integer> c =new Stack<Integer>();

        for(int i=0;i<5;i++)                                // agar user se values leni hai toh
        {
            System.out.println(" Enter your data: ");
            int value = sc.nextInt();
            c.push(value);
        }

        // c.push(100);
        // c.push(200);
        // c.push(300);
        // c.push(400);
        // c.push(500);

         System.out.println(c);

        int d=c.peek();                   //displays last element from stack
        c.pop();                            //delete data from start 
       if(!c.isEmpty()){                     //Stack jab empty nhi hoga tab hi pop operate hoga
        c.pop();
       }

        // System.out.println(d);
       int e=c.search(200);             //position of 200 display karega
        // System.out.println(e);


    }
}
