    package test;
    import java.util.*;
    public class vector {
        public static void main(String [] args)
        {
        // initial size 3, increament is 2
         Vector v=new Vector(3,2);
            System.out.println("Initial Size : "+v.size());
            System.out.println("Initial capacity : "+v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
            System.out.println("Capacity after 4 addition :"+v.capacity());

            v.addElement(new Double(3.25));
            System.out.println("Current Capacity :"+v.capacity());

          v.addElement(new Double(6.08));
          v.addElement(new Integer(7));
          System.out.println("Current capacity: " + v.capacity());

          v.addElement(new Float(9.4));
      v.addElement(new Integer(10));
      System.out.println("Current capacity: " + v.capacity());
        
        v.addElement(new Integer(11));
      v.addElement(new Integer(12));
      System.out.println("First element: " + (Integer)v.firstElement());
      System.out.println("Last element: " + (Integer)v.lastElement());
        
        if(v.contains(new Integer(3)))
         System.out.println("Vector contains 3");
        
        // enumerate the elements in the vector.
      Enumeration vEnum = v.elements();
      System.out.println("\nElements in vector:");
       
        while(vEnum.hasMoreElements())
         System.out.print(vEnum.nextElement() + " ");
      System.out.println();
        }
    }
