
/**
 8.	Add an Audiobook definition to the project that derives from the Book class
 (inherits the Book class's attributes and methods). Add the following attributes in the class: minutes and seconds,
 which define the duration of the audiobook. Create a constructor where you assign audiobook attribute values
 (title, author, and audiobook duration). Add accessor and mutator methods for all the audiobook attributes.
 Also add a display() method to display information about the audiobook. Then write a program that creates and displays
 one book and two audiobooks. 
 */
public class Audiobook extends Book
{
    private int minutes;
    private int seconds;
    
    public Audiobook(String title, String author, int minutes, int seconds){
        super(title, author);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }
    
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    
    public int getMinutes(){
        return this.minutes;
    }
    
    public int getSeconds(){
        return this.seconds;
    }
    
    public void display(){
        System.out.println("Title: "+this.getTitle()+" Author: "+this.getAuthor()+" length: "+this.getMinutes()+" min "
        +this.getSeconds()+" sec");
    }
}
