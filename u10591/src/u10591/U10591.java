    package u10591;

    import java.util.Scanner;

    public class U10591 {

        public static void main(String[] args) {
            // TODO code application logic here
            Scanner key=new Scanner(System.in);
            int t=key.nextInt();
            for (int i = 1; i <=t; i++) {
                int num=key.nextInt();int n=num;
                int sum=0;
                while(true)
                {           
    String number = String.valueOf(num);
    for(int k = 0; k < number.length(); k++) {
        int j=Character.getNumericValue(number.charAt(k));
        sum=sum+(j*j);
        //System.out.println(sum);
    }                  
    if(sum==1)
    {
        System.out.println("Case #"+i+": "+n+" is a Happy number.");
        break;
    }
   else if(sum>9)
    {
   num=sum;
    sum=0;
    }
   else if(sum<9)
    {
         System.out.println("Case #"+i+": "+n+" is an Unhappy number.");
    break;
    }
    }
            }
        }

    }
