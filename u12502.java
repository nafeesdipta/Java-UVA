import java.util.Scanner;
public class u12502
{
public static void main(String [] args)
{
Scanner key=new Scanner(System.in);
int t=key.nextInt();
while(t>0)
{
int x=key.nextInt();
int y=key.nextInt();
int z=key.nextInt();
//x=(z/(x+y))*x;
//y=z-x;
//int c=(int)(x+(x-y));
System.out.println(z*(2*x-y)/(x+y));
t--;
}
}
}