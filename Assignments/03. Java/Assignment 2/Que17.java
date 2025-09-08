class Book{
	private int bookID;
	private String title, author;
	
	Book(int bookid, String booktitle, String bookauthor){
		this.bookID = bookid;
		this.title = booktitle;
		this.author = bookauthor;
	}
	
	public int getBookID(){
		return bookID;
	}
	
	public String getBookTitle(){
		return title;
	}
	
	public String getBookAuthor(){
		return author;
	}
	
	public void setBookID(int bookID){
		this.bookID = bookID;
	}
	
	public void setBookTitle(String title){
		this.title = title;
	}
	
	public void setBookAuthor(String author){
		this.author = author;
	}
	
	public void printBookDetails() {
        System.out.println("\nBook ID: " + this.bookID + ", Title: " + this.title + ", Author: " + this.author);
    }
}

class Library{
	private String libraryName;
	static int totalBooks;
	
	Library(String libname){
		this.libraryName = libname;
	}
	
	public String getLibName(){
		return libraryName;
	}
	
	// public void setLibName(String libraryName){
	// 	this.libraryName = libraryName;
	// }
	
	public void addBook(Book b){
		totalBooks++;
		System.out.println("Book: "+b.getBookTitle()+" by "+b.getBookAuthor()+" added to "+libraryName);
	}
	
	public void displayTotalBooks(){
		System.out.println("Total Book Count: "+totalBooks);
	}
}

class Que17{
	public static void main(String args[]){
		
		Book b1 = new Book(10241, "Your Dreams are Mine Now!", "Ravinder Singh");
		Book b2 = new Book(12785, "Twisted Games", "Ana Huang");
		Library lib = new Library("CDAC Library");
		
		System.out.println();
		lib.addBook(b1);
		lib.addBook(b2);
		lib.displayTotalBooks();
	}
}
