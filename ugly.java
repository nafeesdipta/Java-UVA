public class ugly
{
  public static void main(String [] args)
  {
    boolean b=true;
    int i=0;int c=2;int flag=0;
    for(i=1;i<=20;i++)
    {
      if(i%2==0)
      {
        flag=0;
          for(c=3;c<=20;c++)
          {
            if(c!=3)
            {
              if(c!=5)
              {
              if(i%c==0)
              {               
                flag++;
                break;
              }
              } 
            }
          }       
        if(flag==0)
        {
          System.out.println(i);
        }
      }
    }
  }
}