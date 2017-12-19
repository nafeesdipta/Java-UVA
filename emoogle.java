import java.util.Scanner;
public class emoogle
{
  public static void main(String [] args)
  {
    Scanner key =new Scanner(System.in);
    int t;
    int i=0;
    while(true)
    {
      t=key.nextInt();
      if(t==0)
      {
        break;
      }
      else
      {               
          int s=0;int a=0;
          for(int c=0;c<t;c++)
          {
            int k=key.nextInt();
            if(k==0)
            {
              a++;
            }
            else
            {
              s++;
            }
          }
          System.out.println("Case "+(++i)+": "+(s-a));        
        }
      }
    }
  }
