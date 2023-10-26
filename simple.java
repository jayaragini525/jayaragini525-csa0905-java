import java.util.*;

class simple {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = s.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = s.nextInt();

        System.out.print("Is the customer a senior citizen (y/n): ");
        char isSeniorCitizen = s.next().charAt(0);

        double rateOfInterest;
        if (isSeniorCitizen == 'y' || isSeniorCitizen == 'Y') {
            rateOfInterest = 0.12; 
        } else {
            rateOfInterest = 0.10; 
        }

        double interest = (principal * rateOfInterest * years);
        System.out.println("Interest: " + interest);

      
    }
}
