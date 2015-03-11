/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*; 


/**
 *
 * @author Student
 */
public class Cart {
    
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
   

    public int gettotalprice()
    {   
       int totalprice=0;
       int k;
       
       for(Map.Entry<Product,Integer> entry: products.entrySet())
       {
           k=entry.getValue();
           totalprice=totalprice+entry.getKey().getprice(k);
           
       }

        return totalprice;
        
    }
    
    public String toString()
    {
        String s="";
       
       for(Map.Entry<Product,Integer> entry: products.entrySet())
       {
           
           s=s+entry.getKey().getClass().getName()+" "+entry.getKey().toString()+"\n";
              
       }
       
       return s;
       
    }
    
    public void add(Product p,int nr)
    {
        products.put(p, nr);
    }
    
       
}
