public class swtch {
    public static void main(String[] args){
        String day = "Sunday";
        String result;
        
        result = switch(day)
        {
            case "Sunday" -> "6 a.m";
            case "Monday" -> " 5 a.m";
            default -> "4 a.m";
        };
        System.out.println(result);
    }
}
