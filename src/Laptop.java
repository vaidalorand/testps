/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Laptop extends Product{
    
    String processor;
    int screensize;
    int price;
    
    public Laptop(String name, int price, String processor,int screensize)
    {
        super(name, price);
    
        this.processor=processor;
        this.screensize=screensize;
        this.price=price;
        
        
    }
    
    
    public int getprice(int k)
    {
        if(k<4)
        {
            return price*k;
        }
        else
        {
            int aux=price%10;
            
            return (price-aux)*k;
        }
    }
    
   
    public String toString()
    {
        String s;
        
        s=processor+" "+screensize+" "+price;
        
        return s;
    
    }
    
    
}
