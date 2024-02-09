import java.util.LinkedList;
import java.util.Queue;

public class queue_col_frame {
    public static void main(String[] args) {
        Queue<Integer> c= new LinkedList<>();
        c.offer(10);
        c.offer(20);
        c.offer(30);
        c.offer(40);

        System.out.println(c.peek());          //phele element dikhayega
        System.out.println(c);
        c.poll();  
        c.poll();                            //dequeue the data from front
        System.out.println(c);


    }
    
}
