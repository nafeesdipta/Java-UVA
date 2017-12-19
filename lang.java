import java.util.Scanner;
import java.util.StringTokenizer;
public class lang
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    String s=key.next();
    int i=1;
    while(!s.equals("#"))
    {     
     if(s.equals("HELLO"))
      {
        System.out.println("Case "+i+":"+" ENGLISH");
        i++;
      }
    else if(s.equals("HOLA"))
      {
        System.out.println("Case "+i+":"+" SPANISH");
        i++;
      }
    else if(s.equals("HALLO"))
      {
        System.out.println("Case "+i+":"+" GERMAN");
        i++;
      }
   else if(s.equals("BONJOUR"))
      {
        System.out.println("Case "+i+":"+" FRENCH");
        i++;
      }
   else if(s.equals("CIAO"))
      {
        System.out.println("Case "+i+":"+" ITALIAN");
        i++;
      }
   else if(s.equals("ZDRAVSTVUJTE"))
      {
        System.out.println("Case "+i+":"+" RUSSIAN");
        i++;
      }
     else
     {
     System.out.println("Case "+i+":"+" UNKNOWN");
     i++;
     }
     s=key.next();
    }
    }
  }
