public class Switch {
    public static void main(String[] args) {
        
        String day = "Tuesday";
        String result ="";

        switch(day) {
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            case "Tuesday" -> result = "9am";
            default -> System.out.println("7am");
        }
        System.out.println(result);
    }    
}
