package org.streamapi;
import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
    
	
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        Product Product1=new Product(1,"HP Laptop",25000f);  
        Product Product2=  new Product(2,"Dell Laptop",30000f);  
        Product Product3=new Product(3,"Lenevo Laptop",28000f);  
        Product Product4=new Product(4,"Sony Laptop",28000f);  
        Product Product5=new Product(5,"Apple Laptop",90000f);  
        productsList.add(Product1);
        productsList.add(Product2);
        productsList.add(Product3);
        productsList.add(Product4);
        productsList.add(Product5);
        
        
        
        
        
        
        
        
        
        //1St program
        
      
      //  productsList.stream().filter(product->product.price<30000f).map(product->product).
      // forEach(product->System.out.println(product.id+"\t"+product.name+"\t"+product.price));
        
        //2nd Program
   //  productsList.stream().map(product->product).forEach(product->System.out.println(product.id+"\t"+product.name+"\t"+product.price));
        
        //3rd program
    //  long count=  productsList.stream().filter(product->product.price<30000f).count();
    //  System.out.println(count);
      
        
        
        
    }
}