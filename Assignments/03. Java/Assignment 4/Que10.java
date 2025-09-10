class Que10{

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
		
		//insert and append method of StringBuilder
        sb.insert(5, " CDAC");

        sb.append(" Java Student");

        System.out.println(sb.toString());
    }
}
