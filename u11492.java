import java.util.Scanner;
public class u11492
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();int c=-1;
    String [] a=new String [t];
    while(t>0)
    {
      int flag1=0;int flag2=0;
      int [] man=new int [10];
      for(int i=0;i<man.length;i++)
      {
        man[i]=key.nextInt();
        if(i>0)
        {
          if(man[i-1]>man[i])
          {
            flag1++;
          }
          else if(man[i-1]<man[i])
          {
            flag2++;
          }
        }
      }
      if(flag1==9||flag2==9)
      {
      a[++c]="Ordered";
      }
      else
      {
      a[++c]="Unordered";
      }
      t--;
    }
    System.out.println("Lumberjacks:");
    for(int i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}