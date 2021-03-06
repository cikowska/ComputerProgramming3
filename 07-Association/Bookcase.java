
/**
 10.	Books can be placed on a bookcase. Create a class diagram. Use the previously defined Book and Writer classes
 (created diagram should contain three classes). Assume that the bookcase can hold any number of books.
 When creating a class diagram, pay attention to the relationships between classes, taking into account that the book
 can exist independently of the bookcase. Mark the multiplicity in the class diagram. Then, based on the class diagram,
 write a program that allows books to be placed in and removed from the bookshelf. Display the bookcase contents. 

*/

import java.util.ArrayList;

 public class Bookcase
{
    ArrayList<Book> arr = new ArrayList<Book>();
    
    
    public void addBook(Book book){
        this.arr.add(book);
    }
    
    public void removeBook(Book book){
        
        this.arr.remove(book);
    }
    
    public void display(){
        System.out.println("Bookcase content:");
        for (Book b: arr){
            b.display();
        }
    }
    
}
