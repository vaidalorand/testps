/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class L1 {
    
   
    
    public static void main(String[] args)
    {
        
       
        Cart c=new Cart();
        
        Laptop l1=new Laptop("l1",1100,"i3",15); 
        Laptop l2=new Laptop("l2",1600,"i5",15);
        Laptop l3=new Laptop("l3",2100,"i7",15); 

        Mobile m1=new Mobile("m1",1400,"Android",16);
        Mobile m2=new Mobile("m1",2300,"IOS",64);
        Mobile m3=new Mobile("m1",1000,"Sybian",8);
        
        
        c.add(l1,2);
        c.add(l2,4);
        c.add(l3,3);
        
        c.add(m1,2);
        c.add(m2,4);
        c.add(m3,3);
        
        System.out.println("The HashMap contains: \n\n"+c.toString());
        
        System.out.println("The total price is: "+c.gettotalprice());

    
    }
    
    
    
}
