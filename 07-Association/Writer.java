

/*8.	Based on the created class diagram, define the classes in the
 * programming language.
 * Put the classes in a separate project. Then write a program that creates
 * objects, assigns them attribute values, and calls the available methods. 
 */
public class Writer
{
    
    private String name;
    private String surname; 

    /**
     * Constructor for objects of class Writer
     */
    public Writer(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String toString() {
        return "Name: "+this.name+" surname: "+this.surname;
    
    }
    
    
    
    public void writeABook() {
        
    }
}

