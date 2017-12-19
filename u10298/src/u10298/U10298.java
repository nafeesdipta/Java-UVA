/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u10298;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nafees
 */
public class U10298 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key=new Scanner(System.in);
        while (key.hasNext()) {
            String str=key.next();
            int [] man=new int[str.length()];
            if(str.equals("."))
            {break;}     
            String substring=String.valueOf(str.charAt(0));
        int count=0; int r=-1;
            for (int i = 1; i <str.length(); i++) {
            substring=substring.concat(String.valueOf(str.charAt(i)));
        int index=str.indexOf(substring); // To find first occurrence
        while(index<str.length() && index != -1) 
        {
            index=str.indexOf(substring,index+1);/// to find next occurrences 
            count=count+1;
        }
             man[++r]=count;
            }
            Arrays.sort(man);
    System.out.println("substring count is    "+count);
        }
    }
    
}
