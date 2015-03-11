/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Mobile extends Product{
    
    String os;
    int memory;
    int price;
    
    
    public Mobile(String name,int price,String os,int memory)
    {   
        super(name,price);
        this.memory=memory;
        this.os=os;
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
        
        s=os+" "+memory+" "+price;
        
        return s;
    
    }
    
    
}
