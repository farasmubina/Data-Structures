import java.util.ArrayList;
import java.util.List;

public class array_list{
    public static void main(String[] args) 
    {
        List <Integer> c = new ArrayList<>();         //ye list ki form me print karwata hai matlb ki [] brackets me
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        // c.remove(2);
        int d=c.get(2);
        c.set(1,19);
        // c.clear();
        boolean f=c.contains(10);
        System.out.println(f);

        for (int i=0;i<c.size();i++){                  //agar list k form me data print nhi krwana hota hai tab
             System.out.println(c.get(i));
        }
    }
}
