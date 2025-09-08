interface Callable{
	public void makeCall();
}

interface Messaging{
	public void sendMessage();
}

interface Internet{
	public void browse();
}

class SmartPhone implements Callable, Messaging, Internet{
	
	private long number;
	private String message, url;
	
	SmartPhone(long number, String message, String url){
		this.number = number;
		this.message = message;
		this.url = url;
	}
	
	// Getter and Setter for number
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Getter and Setter for url
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
		this.url = url;
	}
	
	public void makeCall(){
		System.out.println("\nCalling: "+getNumber());
	}
	
	public void sendMessage(){
		System.out.println("Sending message to "+getNumber()+": "+getMessage()+"!");
	}
	
	public void browse(){
		System.out.println("Browsing website: "+getUrl());
	}
}

class Que26{
	public static void main(String args[]){
		
		SmartPhone s = new SmartPhone(9876543210L, "Hello", "www.google.com");
		s.makeCall();
		s.sendMessage();
		s.browse();
		System.out.println();
	}
}

