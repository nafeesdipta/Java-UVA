import java.util.Scanner;
public class onetwo
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    String o="one";
    String tw="two";
    String r="three";
    int t=key.nextInt();
    while(t>0)
    {
      int j=0;
      String k=key.next();
      if(k.length()==o.length())
      {
        if(k.equals(o))
        {
          System.out.println(1);
        }
        else
        {
          for(int c=0;c<k.length();c++)
          {
            char a =k.charAt(c);
            char b=o.charAt(c);
            if(a!=b)
            {
              j++;
            }
          }
          if(j==1)
          {
            System.out.println(1);
          }
          j=0;
        }
      }
      if(k.length()==tw.length())
      {
        if(k.equals(tw))
        {
          System.out.println(2);
        }
        else
        {
        for(int c=0;c<k.length();c++)
        {
          char a =k.charAt(c);
          char b=tw.charAt(c);
          if(a!=b)
          {
            j++;
          }
        }
        if(j==1)
        {
          System.out.println(2);
        }
        }
      }
      else if(k.length()==r.length())
      {
        if(k.equals(r))
        {
          System.out.println(3);
        }
        else
        {
        for(int c=0;c<k.length();c++)
        {
          char a =k.charAt(c);
          char b=r.charAt(c);
          if(a!=b)
          {
            j++;
          }
        }
        if(j==1)
        {
          System.out.println(3);
        }
        }
      }
      t--;
    }
  }
}