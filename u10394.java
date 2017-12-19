import java.util.Scanner;
public class u10394
{
  public static void main (String args[])
  {
    int limit=20000000;
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
      i+=2;
    }
    int []prime=new int[1000000+1];
    int n=1;
    i=3;
    while(n!=100005)
    {
      if (data_container[i]==0 && data_container[i+2]==0)         
      {
        prime[n]=i;
        n++;
      }
      i+=2;
    }
    while(key.hasNext())
    {
      int v=key.nextInt();
      System.out.println("("+prime[v]+", "+(prime[v]+2)+")");
    }
  }
}