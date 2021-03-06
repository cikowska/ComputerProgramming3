
/**
 *9.	Add a Library class definition to your project that contains an attribute that stores any books, ebooks, or audiobooks.
 *Apply an array. Consider the correct data type for the array. Then write a program that creates and displays one book,
 *two e-books and two audiobooks. Save all object in the library. Display the contents of the library.
 *Notice which display() object methods are called. 
 */

import java.util.ArrayList;
public class Library
{
    private ArrayList<Book> arr;
    
    public Library(){
        this.arr = new ArrayList<Book>();
    }
    
    public void addToLibrary(Book book){
        this.arr.add(book);
    }
    
    public void displayLibrary(){
        System.out.println("List of books in library:");
        for (Book b: this.arr){
            b.display();
        }
    }

    
}
