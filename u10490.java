import java.util.Scanner;
public class u10490
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int k=key.nextInt();
    int sum=0;
    for(int i=1;i<k;i++)
    {
    if(k%i==0)
    {
    sum=sum+i;
    }
    }
    if(sum==k)
    {
    System.out.println("Perfect!!!");
    }
    else
    {
    System.out.println("no");
    }
  }
}