
/*11.	The Product class describes food products using two attributes: the product name and whether the product is vegetarian.
 * Define the class, its attributes, and getter and setter methods for all attributes. Then create a product, set attributes'
 * values and display product information. 
 */
public class Product
{
    private String name;
    private boolean vege;
    
    public String getName(){
        return this.name;
    }
    
     public boolean getVege(){
        return this.vege;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setVege(boolean vege){
        this.vege = vege;
    }
    
    public String toString(){
        return "Name: "+this.name+" Is vegetarian: "+this.vege;
    }
}
