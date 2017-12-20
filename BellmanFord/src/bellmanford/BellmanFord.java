package bellmanford;
import java.io.*;
import java.util.*;
public class BellmanFord 
{
    public static void main(String[] args) throws FileNotFoundException
    {
     File file=new File("b.txt");
     Scanner key=new Scanner(file);     
            int N = key.nextInt();
            int M = key.nextInt();
            int[] d = new int[N];
            Edge[] edges = new Edge[M];
             
            // initialization
            for(int i = 1; i < N; i++)
            {
                d[i] = Integer.MAX_VALUE;
            }
            // read all edges
            for(int i = 0; i < M; i++)
            {
                edges[i] = new Edge(key.nextInt(), key.nextInt(), key.nextInt());
            }
            // relaxation
            for(int i = 0; i < N-1; i++) {
                for(int j = 0; j < M; j++) {
                    Edge e = edges[j];
                    if(d[e.d] > d[e.s] + e.w)
                        d[e.d] = d[e.s] + e.w;
                }
            } 
            boolean flag = false; 
            // reporting
            /*
            for(int j = 0; j < M; j++) {
                Edge e = edges[j];
                if(d[e.d] > d[e.s] + e.w) {
                    System.out.println("  No solution -- graph has a negative cycle.");
                    flag = true;
                }
            } 
                    
                  */
            for(int i = 0; !flag && i < N; i++)
            {                
                System.out.print(0+"--> "+i+": "+d[i]); 
            System.out.println("");
            }
        
        key.close();
    }
    
}
