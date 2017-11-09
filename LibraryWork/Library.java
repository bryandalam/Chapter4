package LibraryWork;


public class Library
{
    private Book[] books;
    private String name;
    
    public Library(int size, String nm)
    {
        // initialise instance variables
        this.books = new Book[size];
        this.name = nm;
    }
    public void addBook(int location, Book b){
        books[location] = b;
    }
    public String toString() {
        String output = "The library " + name + " has the following: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;
    }

    
}
