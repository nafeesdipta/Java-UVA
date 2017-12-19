import java.util.Scanner;
public class salary
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();
    int min,max,i;
    int n=0;int ii=1;
    if(t<20)
    {
      while(t>0)
      {
        int [] man=new int[3];
        i=0;n=0;          int k=0;
        while(i<man.length)
        {
          int c=key.nextInt();
          if(c>=1000 && c<=10000)
          {
            man[k]=c;
            n=n+man[k];
            k++;
          }
          i++;
        }
        i=0;
        max=man[i];
        min=man[i];
        while(i<man.length)
        {
          if(man[i]>max)
          {
            max=man[i];
          }         
          else if(man[i]<min)
          {
            min=man[i];
          }
          i++;
        }
        int p=max+min;
        System.out.println("Case "+ii+": "+ (n-p));
        ii++;
        t--;
      }
    }       
  }
}