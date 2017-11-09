package LibraryWork;


/**
 * Write a description of class AhsLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AhsLibrary
{
    public void main(String[] args) {
        Library ahs = new Library(10, "Acalanes");
        Author joe = new Author("Joe", 34);
        Book b = new Book(joe, "Java Book");
        ahs.addBook(0, b);
        System.out.println(ahs);
        
        
        
        
        
        
        
    }
    
}
