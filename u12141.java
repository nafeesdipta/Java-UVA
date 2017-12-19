import java.util.Scanner;
public class u12141
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    
    while(key.hasNext())
    {
      int t=key.nextInt();
      if(t==0)
      {break;}
      else
      {
        int sum=0;
        for(int i=1;i<=t;i++)
        {
          sum=sum+(i*i);
        }
        System.out.println(sum);
      }
    }
  }
}