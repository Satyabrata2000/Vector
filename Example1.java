package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Example1 {

    public static void main(String[] args) {

        Vector v = new Vector(3, 2);
        System.out.println("Initial size is " + v.size());
        System.out.println("Initial capacity is " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions " + v.capacity());

        v.addElement(new Double(6.08));
        System.out.println("Current capacity " + v.capacity());

        v.addElement(new Double(7.23));
        v.addElement(new Integer(6));
        System.out.println("Current capacity " + v.capacity());
        System.out.println("First Element is " + v.firstElement());
        System.out.println("Last Element is " + v.lastElement());

        //enumerate the elements in the vector
        Enumeration vEnum = v.elements();
        System.out.println("Elements in vector ");
        while(vEnum.hasMoreElements()){
            System.out.println(vEnum.nextElement()+ " ");
        }
    }
}
