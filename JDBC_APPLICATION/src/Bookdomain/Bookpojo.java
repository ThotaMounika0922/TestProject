package Bookdomain;

public class Bookpojo
{
    /* at the very beginning we need to create instance variables **/

    public int Isbn; 
    public String BookName;
    public String AuthorName;
    public int Edition;
    //Generate getters and setters

	public int getIsbn() {
		return Isbn;
	}

	public void setIsbn(int isbn) {
		Isbn = isbn;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public int getEdition() {
		return Edition;
	}

	public void setEdition(int edition) {
		Edition = edition;
	}
    
    
    

   
}   