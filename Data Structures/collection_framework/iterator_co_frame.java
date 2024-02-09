import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator_co_frame {
    public static void main(String[] args) {
        List <Integer> c = new ArrayList<>();         //ye list ki form me print karwata hai matlb ki [] brackets me
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        ListIterator<Integer> d= c.listIterator();     //ListIterator-interface  ,c.listIterator()-class
        while (d.hasNext()) {
            System.out.println(d.next());
        }
      
    System.out.println("----------");

        while (d.hasPrevious()) {
            System.out.println(d.previous());
        }

    }
    
    
}
