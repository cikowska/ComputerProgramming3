
/*7.	Add an Ebook class definition to your project that derives from the Book class
(inherits the Book class attributes and methods). Add an attribute: file name. Create a constructor where you assign
the ebook attribute values (title, author and file name). Add accessor and mutator methods for all ebook attributes.
Also add a display() method to display information about the ebook. Then write a program that creates and displays
one book and two e-books. 
     */
    public class Ebook extends Book
    {
       private String fileName;
       
    public Ebook(String title, String author, String fileName){
        super(title, author);
        this.setFileName(fileName);
        
    }
 
    public void setFileName(String fileName){
        this.fileName = fileName;
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    public void display(){
        System.out.println("Title: "+this.getTitle()+" Author: "+this.getAuthor()+" file name: "+this.getFileName());
    }

    }

