import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset_cl_frame {
    public static void main(String[] args) {
        Set<Integer> c= new TreeSet<>();    //sorted sequence me print karwata hai
        c.add(10);
        c.add(50);
        c.add(100);
        c.add(60);
        c.add(10);             //duplicate value print nahi karwata as it is already in the list

        System.out.println(c);


    }
    
    }
    

