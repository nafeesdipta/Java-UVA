/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u10394;

import java.util.Scanner;

/**
 *
 * @author Nafees
 */
public class U10394 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int limit=1000;
    int []data_container=new int[limit+1];
    int i=3;
    Scanner key=new Scanner(System.in);
    while(i<=Math.sqrt(limit))
    {
      int j=i*i;
      if(data_container[i]==0)
      {
        while(j<=limit)
        {
          data_container[j]=1;
          j+=2*i;
        }
      }
      i++;
    }
    int n=0;
      int v=key.nextInt();
          i=3;
    while(i<=limit)
    {
      if (data_container[i]==0)         
      {
        int p=1;
        while(data_container[i+p]!=0)
        {
        if(data_container[i+p]-data_container[i]==2)
        {
          n++;
        break;
        }          
          p++;
        }       
      }
      if(v==n)
      {
       System.out.println("("+data_container[i]+","+" "+data_container[i+1]+")");
       n=0;
       break;
      }
      i+=2;
    }
   
        // TODO code application logic here
    }
    
}
