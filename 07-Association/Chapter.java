
/*
 11.	Add a Chapter class to the diagram that you have created, describing the chapter in a book
 (chapter title, number of pages, starting page number). Assume that a book can contain any number of chapters.
 What is the relationship between the book and chapters? Can a chapter exist without a book? Then modify the program for
 operating the bookshelf. 
 */
public class Chapter
{
    private String chapTitle;
    private int numberOfPages;
    private int startNumber;
    
    public Chapter(String chapTitle, int numberOfPages, int startNumber){
        this.setChapTitle(chapTitle);
        this.setNumberOfPages(numberOfPages);
        this.setStartNumber(startNumber);
        
    }
    
    public void setChapTitle(String chapTitle){
        this.chapTitle = chapTitle;
    }
    
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    
    public void setStartNumber(int startNumber){
        this.startNumber = startNumber;
    }
    
    public String getChapTitle(){
        return this.chapTitle;
    }
    
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    
    public int getStartNumber(){
        return this.startNumber;
    }
    
}
