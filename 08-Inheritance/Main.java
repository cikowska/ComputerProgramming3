
/*Then write a program that creates and displays two books. 
 * Then write a program that creates and displays
one book and two e-books. 
 */
public class Main
{
   
public static void main(String[] args){
    Book book1 = new Book("Hobbit","J.R.R. Tolkien");
    Book book2 = new Book("Ogniem i Mieczem","H. Sienkiewcz");
    book1.display();
    book2.display();
    Ebook ebook1 = new Ebook("Hobbit","J.R.R. Tolkien", "file1");
    Ebook ebook2 = new Ebook("Ogniem i Mieczem","H. Sienkiewcz", "file2");
    ebook1.display();
    ebook2.display();
    Audiobook audio1 = new Audiobook("Hobbit","J.R.R. Tolkien", 300, 30);
    audio1.display();
    Library library = new Library();
    library.addToLibrary(book1);
    library.addToLibrary(ebook1);
    library.addToLibrary(audio1);
    library.displayLibrary();
    
    
}
   
}

