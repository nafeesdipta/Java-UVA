import java.util.Scanner;
public class parking
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();
    int min,max,n,i;
    if(t>=1 && t<=100)
    {
    while(t>0)
    {
      n=key.nextInt();
      i=0;
      int [] man=new int[n];
      if(n>=1 && n<=20)
      {
      while(n>0)
      {
        int c=key.nextInt();
        if(c>=0 && c<=99)
        {
        man[i]=c;
        i++;
        }
        n--;        
      }
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
      System.out.println((max-min)*2);
      t--;
    }
  }
  }
}