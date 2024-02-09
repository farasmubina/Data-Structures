import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue_cl_frame {
    public static void main(String[] args) {
        Queue<Integer> c= new PriorityQueue<>(Comparator.reverseOrder());    //agar comparator.reverseOrder() use krte hai toh max heap implement hota hai aur max element se front hota hai
        c.offer(10);          
        c.offer(20);
        c.offer(30);
        c.offer(40);
        c.offer(50);
        System.out.println(c);          //min heap implement hota hai isliye sequence in inserion me print nhi karega
        c.poll();                    //10 delete hoga as it was the minimum element in the queue
        System.out.println(c);           //20 is the parent of the heap
    }
    
}
