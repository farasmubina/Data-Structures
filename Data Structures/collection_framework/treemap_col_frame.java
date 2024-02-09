
import java.util.Map;
import java.util.TreeMap;


public class treemap_col_frame {
    public static void main(String[] args) {
        Map<Integer,String> c =new TreeMap<>();  //1:"sadia"    , 4:"mubina"
         
       c.put(1, "A");
       c.put(3, "B");
       c.put(2, "C");
       c.put(4, "D");
       c.put(10,"sadia");
    //           //overwrite nhi krta
c.putIfAbsent(7, "F");     //agara nhi ho toh print krta hai

// System.out.println(c.isEmpty());     //check it is empty or not 
 c.remove(3)  ;             //key value 3 wala element delete hoga
 for (Integer d:c.keySet())
 {
    System.out.println(d);
 }

 for (String d:c.values())
 {
    System.out.println(d);
 }

//  System.out.println(c);  
    }

    
}
