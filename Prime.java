import java.util.Scanner;
public class Prime
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int c=2;int flag=0;
    int i=key.nextInt();
    if(i%2==0)
      System.out.println("Given number is NOT prime! NO perfect number is available");
    else
    {
    for(c=2;c<i;c++)
      {
        if(i%c==0)
        {
          flag++;
        }
      }
      if(flag==0)
      {
double sum=(Math.pow(2,i-1))*(Math.pow(2,i)-1);
int k=(int)Math.round(sum);
System.out.println("Perfect"+":"+" "+k+"!");
      }
      else
      {
      
      }
    }
  }
}