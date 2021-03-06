
/*6.	Create a project where you define a Book class that describes books. Add book attributes: title and author.
 * Create a constructor where you assign book attribute values. Add accessor and mutator methods for all book attributes.
 * Add also a display() method to display information about the book. Then write a program that creates and displays two books. 
 */
public class Book
{
    private String title;
    private String author;
    
    public Book(String title, String author){
        this.setTitle(title);
        this.setAuthor(author);
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public void display(){
        System.out.println("Title: "+this.getTitle()+" Author: "+this.getAuthor());
    }
    
}
