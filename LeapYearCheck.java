public class LeapYearCheck {
    public static void main(String[] args) {
        
        int febDays = 29; // Change this to 28 or 29 to test

        
        String result;

        
        result = (febDays == 29) ? "Leap Year" : "Not a Leap Year";

        // Output the result
        System.out.println("The year with February having " + febDays + " days is " + result + ".");
    }
}
