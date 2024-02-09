//kuch toh gadbad hai code me construcor undefined aa raha hai


package graph;

import java.util.LinkedList;
import java.util.Scanner;


public class graph_implementation{

    private LinkedList<Integer> adjacency[];

    graph_implementation(int v){             // Constructor
        adjacency = new LinkedList[v];
        for (int i=0; i<v;i++){                           //jitne vertices hai utne size ka array create ho jayega
            adjacency[i]=new LinkedList<Integer>();            //each array element ko linked list connect kiya hai   
        }

    }

    public void insertedge(int s, int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);

        System.out.println(adjacency[s]);
        System.out.println(adjacency[d]);
    }

public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of vertices and edges");
    int v= sc.nextInt();
    int e=sc.nextInt();

    graph_implementationg g= new graph_implementation();

    System.out.println("Enter Edges:");
    for(int i=0;i<e;i++)
    {
        int s=sc.nextInt();                              //source
        int d = sc.nextInt();                           //destination
        g.insertedge(s,d);

    }
    

}


}
