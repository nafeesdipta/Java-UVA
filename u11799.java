import java.util.Scanner;
public class u11799
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();int v=0;
    while(t>0)
    {
      int k=key.nextInt();
      int [] man=new int[k];
      int max=man[0];
      for(int i=0;i<man.length;i++)
      {
        man[i]=key.nextInt();
      }
      for(int i=0;i<man.length;i++)
      {
        if(max<man[i])
        {
          max=man[i];
        }
      }
      System.out.println("Case "+(++v)+": "+max);
      t--;
    }
  }
}