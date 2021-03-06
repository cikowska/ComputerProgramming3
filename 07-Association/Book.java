
/*8.	Based on the created class diagram, define the classes in the programming language.
 * Put the classes in a separate project. Then write a program that creates objects, assigns them attribute values,
 * and calls the available methods */

 import java.util.ArrayList;
 public class Book
{
    private Writer author;
    private String title;
    private int year;
    private final ArrayList<Chapter> chapters;
    
    
    public Book(Writer a, String t, int y, ArrayList<Chapter> chapters)
    {
     this.author = a;
     this.title = t;
     this.year = y;
     this.chapters = chapters;
    
    }

  
    public void display()
    {
        String stringChapters = "";
        for (Chapter chapter: chapters){
            stringChapters+=chapter.getChapTitle()+", ";
        }
        
        System.out.println("Title: "+this.title+
            " Author: "+this.author.getName()+" "+this.author.getSurname()+
            " year: "+this.year+" chapters: "+ stringChapters);
    }
    
    
}
