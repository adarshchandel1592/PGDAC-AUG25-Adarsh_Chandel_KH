class Book{
	private String title, author;
	private boolean issued;
	static int totalIssuedBooks;
	
	Book(String booktitle, String authornname, boolean is_issued){
		this.title = booktitle;
		this.author = authornname;
		this.issued = is_issued;
		if(issued){
			totalIssuedBooks++;
		}
	}
	
	public String getTitle(){ //Getter
		return title;
	}
	public String getAuthor(){ //Getter 
		return author;
	}
	public boolean getIssued(){ //Getter
		return issued;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setIssued(boolean issued){
		this.issued = issued;
	}
		
	public static int showTotalIssued(){
		return totalIssuedBooks;
	}
}

class Que3{
	public static void main(String args[]){
		Book b1 = new Book("Harry Potter", "J.K. Rowling", true);
		Book b2 = new Book("Five Point Someone", "Chetan Bhagat", false);
		Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);
		
		System.out.print("\nBook1: issued? "+b1.getIssued());
		System.out.print("\nBook2: issued? "+b2.getIssued());
		System.out.print("\nBook3: issued? "+b3.getIssued());
		System.out.print("\nTotal books issued: "+Book.totalIssuedBooks);
		System.out.println();
		
		
	}
}