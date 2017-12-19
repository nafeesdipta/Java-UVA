package test;
import java.util.*;
public class bitset {
    public static void main(String [] args)
    {
    BitSet b1=new BitSet(16);
    BitSet b2 = new BitSet(16);
    //set some bits
        for (int i = 0; i <16; i++) {
            if((i%2)==0) b1.set(i);         
            if((i%2)==0) b2.set(i);
            
        }       
    System.out.println("Initial pattern in bits1: ");
      System.out.println(b1);
      System.out.println("\nInitial pattern in bits2: ");
      System.out.println(b2);
    
      //And bits
      b2.and(b1);
      System.out.println("\nbits2 AND bits1: ");
      System.out.println(b2);
      
      // OR bits
      b2.or(b1);
      System.out.println("\nbits2 OR bits1: ");
      System.out.println(b2);

      // XOR bits
      b2.xor(b1);
      System.out.println("\nbits2 XOR bits1: ");
      System.out.println(b2);
    }   
}
