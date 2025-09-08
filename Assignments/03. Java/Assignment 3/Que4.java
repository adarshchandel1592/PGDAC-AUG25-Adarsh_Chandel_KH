class Book{
	private int copiesAvailable;
	
	public int getCopies(){
		return copiesAvailable;
	}
	
	public void setCopies(int count){
		this.copiesAvailable = count;
	}
	
	public int addCopies(int n){
		copiesAvailable += n;
		return copiesAvailable;
	}
	
	public int removeCopies(int n){
		if(n>copiesAvailable){
			System.out.println("\nNot enough copies available");
		}
		else{
			copiesAvailable -= n;
		}
		return n;
	}
}

class Que4{
	public static void main(String args[]){
		
		Book b = new Book();
		
		System.out.print("\nAdd Copies: " + b.addCopies(3));
		System.out.print("\nRemove Copies: " + b.removeCopies(1));
		System.out.print("\nCopies Available: " + b.getCopies());
	}
}