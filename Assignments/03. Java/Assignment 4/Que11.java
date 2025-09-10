class Que11{

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Exam postponed");
		//replace method of StringBuilder
        sb.replace(5, 14, "rescheduled");
		
        System.out.println(sb.toString());
    }
}
