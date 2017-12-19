import java.util.Scanner;
public class u10035
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    
    while(key.hasNext())
    {
      int k=key.nextInt();int j=key.nextInt();
      if(k==0 && j==0)
      {
        break;
      }
      else
      {
        int i=0;int c=0;
        while(k!=0||j!=0)
        {
          if((k%10)+(j%10)+i>9)
          {
            i=1;
            c++;
            k=(k/10);
            j=j/10;
          }          
          else
          {
          i=0;
          k=k/10;
          j=j/10;
          }
        }
        if(c==0)
        {
          System.out.println("No carry operation.");
        }
        else if(c==1)
        {
          System.out.println(c+" carry operation.");
        }
        else if(c>1)
        {
        System.out.println(c+" carry operations.");
        }
      }
    }    
  }
}