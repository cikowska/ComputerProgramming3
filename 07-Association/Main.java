import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        Writer writer1 = new Writer("Stanisław", "Lem");
        
        Chapter b1chap1 = new Chapter("Rodział 1", 30, 3);
        Chapter b1chap2 = new Chapter("Rozdział 2", 35, 33);
        
        ArrayList<Chapter> b1Chap = new ArrayList<Chapter>();
        
        b1Chap.add(b1chap1);
        b1Chap.add(b1chap2);
        
        Chapter b2Chap1 = new Chapter("Rodział 1", 25, 2);
        Chapter b2Chap2 = new Chapter("Rozdział 2", 35, 27);
        
        ArrayList<Chapter> b2Chap = new ArrayList<Chapter>();
        
        b2Chap.add(b2Chap1);
        b2Chap.add(b2Chap2);
        
        Book book1 = new Book(writer1, "Solaris", 2012, b1Chap);
        Book book2 = new Book(writer1, "Bajki robotów", 1990, b2Chap);
        book1.display();
        Bookcase bookcase = new Bookcase();
        bookcase.addBook(book1);
        bookcase.addBook(book2);
        bookcase.display();
        bookcase.removeBook(book2);
        bookcase.display();
        
        
    }
}
   
