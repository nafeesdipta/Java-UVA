import java.util.Scanner;
public class uvafac
{
  public static void main(String [] args)
  {
    Scanner key =new Scanner(System.in);
    System.out.println("Enter your number");
    int n =key.nextInt();
    long r=1;
    if(n==0 || n==1)
    {
      System.out.println(1);
    }
    else
    { 
     for(int i=1;i<=n;i++)
     {
       r=r*i; 
    }
      System.out.println(r);
    }
  }
}