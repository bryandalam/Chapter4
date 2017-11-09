package LibraryWork;



public class Book
{
    private String title;
    private Author bookAuthor;
    public Book(Author a, String ttl) {
    this.title = ttl;
    this.bookAuthor = a;
   }
   public String toString() {
    return "The title is " + title + "by " + bookAuthor;
        
    }

    
}
