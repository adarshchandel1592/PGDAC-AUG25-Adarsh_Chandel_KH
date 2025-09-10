class Que8{
	public static void main(String args[]){
		
		try{
			throw new Exception("Payment Failed");
		}catch(Exception e){
			System.out.println("Exception occured: "+ e.getMessage());
		}finally{
			System.out.println("Cleanup Done");
		}
	}
}