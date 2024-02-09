import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);

        // c. remove(50);
        // c. clear();

       int d= c.size();
    //    System.out.println(d);

    System.out.println(c.contains(70));      //70 element nhi ahi toh false return karega

        System.out.println(c);

        
    }
    
}
