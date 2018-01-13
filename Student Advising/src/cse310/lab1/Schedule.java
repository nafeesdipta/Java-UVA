package cse310.lab1;
import java.util.*;
public class Schedule {
    int i1=5;
    int i2=5;
    int i3=5;
    int k1,k2,k3=-1;
    Scanner ky=new Scanner(System.in);
    public void show()
    {
        System.out.println(" Section­01  Sunday: 12:30 pm ­ 1:00 pm  "+(i1)+ " Seats Remaining ");    
        System.out.println(" Section­02  Sunday: 2:30 pm ­ 4:00 pm  "+(i2)+ " Seats Remaining "); 
        System.out.println(" Section­03  Sunday: 5:30 pm ­ 7:00 pm  "+(i3)+ " Seats Remaining "); 
    }
    public void call()
    {
        System.out.println("Please Enter Your Desired Section");
        int i=ky.nextInt();
         for (int j = 0; j < 10; j++) {
            if(i==1 && i1==0)
            {
                System.out.println("Section is full!!!Please choose another section");
            }
            if(i==2 && i2==0)
            {
                System.out.println("Section is full!!!Please choose another section");
            }
            if(i==3 && i3==0)
            {
                System.out.println("Section is full!!!Please choose another section");
            }
            else if(i==1)
            {
            --i1;
            ++k1;
            St_Data.s1[k1]=new Lec_Entry(Menu.le[k1].name,Menu.le[k1].id);
            St_Data.s1[k1].name=Menu.le[k1].name;
            St_Data.s1[k1].id=Menu.le[k1].id;
            break;
            }
            else if(i==2)
            {
            --i2;
            ++k2;
            St_Data.s2[k2]=new Lec_Entry(Menu.le[k2].name,Menu.le[k2].id);
            St_Data.s2[k2].name=Menu.le[k2].name;
           St_Data.s2[k2].id=Menu.le[k2].id;
            break;
            }
            else if(i==3)
            {
            --i3;
            ++k3;
            St_Data.s3[k3]=new Lec_Entry(Menu.le[k3].name,Menu.le[k3].id);
            St_Data.s3[k3].name=Menu.le[k3].name;
            St_Data.s3[k3].id=Menu.le[k3].id;
            break;
            }
            }
    }
}
