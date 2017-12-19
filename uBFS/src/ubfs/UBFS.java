package ubfs;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UBFS {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        int man [][] =new int[6][6];
        int [] pred=new int[6+1];
        boolean [] v=new boolean[6+1];
        Arrays.fill(v,false);
        Arrays.fill(pred, -1);
        for (int i = 0; i <man.length; i++) {
       int ii=key.nextInt();
       int c=key.nextInt();
        man[ii][c]=1;
        man[c][ii]=1;
      }  
        System.out.println("Printing the matrix");
        for(int i=0;i<man.length;i++)
      {
        for(int j=0;j<man.length;j++)
        {
          System.out.print(man[i][j]);
          System.out.print(" ");
        }
        System.out.println();
      }
    System.out.println("-------List------");
        System.out.println("Enter Starting Point");
      int start=key.nextInt();
      int u=start;
         LinkedList<Integer> a=new LinkedList<>();
         Queue<Integer> b=new LinkedList<>();
         a.add(u);
         v[u]=true;
         while(!a.isEmpty())
         {
        for(int j=0;j<man.length;j++)
        { 
          if(man[u][j]==1)
          { 
              if(v[j]!=true)
              {
              v[j]=true;
              a.add(j);
              pred[j]=u; 
              }
          }
        } 
        a.removeFirst();
        u=a.peek();
   }
          System.out.println("Enter End Point");
        int e=key.nextInt();
        System.out.print(e);
        while(pred[e]!=start)
        {            
            System.out.print(" "+pred[e]);
            e=pred[e];       
        }
        System.out.print(" "+start);
        System.out.println();
    }
    }    

