import java.util.Scanner;
public class birthday2
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();int v=0;
    String [] man=new String[t];
    String [] b={
      "Happy","birthday","to","you",
      "Happy","birthday","to","you",
      "Happy","birthday","to","Rujia",
      "Happy","birthday","to","you"};
        int k=0;int j=0;
    for(int i=0;i<t;i++)
    {
      man[i]=key.next();
    }
    if(t>16)
    {
    v=t/16+1;
    v=v*16;
    for(int i=0;i<v;i++)
    {
      if(j==b.length)
      {
      j=0;
      }
      if(k==t)
      {
      k=0;
      }
    System.out.println(man[k]+": "+b[j]);
    k++;j++;
    }
    }
    else
    {
      k=0;j=0;
    for(int c=0;c<=15;c++)
    {
        if(k==t)
        {
          k=0;
        }
        if(j==b.length)
        {
          j=0;
        }
        System.out.println(man[k]+": "+b[j]);
        k++;j++;
      }
    }
  }
}