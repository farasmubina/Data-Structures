import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linedhashsaet_col_frame {
    public static void main(String[] args) {
        Set<Integer> c= new LinkedHashSet<>();    //same sequence me print karta hai jis sequence me insert kiya jata hai
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);
        c.add(10);             //duplicate value print nahi karwata as it is already in the list

        System.out.println(c);


    }
    
}
