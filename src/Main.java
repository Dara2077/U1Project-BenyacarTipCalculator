//Imports scanner capability
import java.util.Scanner;

//Imports rounding to two decimal places capability
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
        //Allows for scanner capability
        Scanner scan = new Scanner(System.in);

        // Collecting input from user
        System.out.print("What is your total bill? ");
        double totalBill = scan.nextDouble();
        System.out.print("What is your tip percentage? ");
        int tipPercentage = scan.nextInt();
        System.out.print("How many people are in your party? ");
        int numPeople = scan.nextInt();

        //Declaring and initializing variables to their proper values
        double totalTipAmount = totalBill* ((double)tipPercentage/100);
        double totalBillWithTip = totalBill + totalTipAmount;
        double tipPerPerson = totalTipAmount/numPeople;
        double totalPerPerson = totalBillWithTip/numPeople;

        //Creating a decimal format to round numbers to two decimals
        DecimalFormat roundNumber = new DecimalFormat("0.00");

        //Rounding numbers
       String stringTotalTipAmount = roundNumber.format(totalTipAmount);
       String stringTotalBillWithTip = roundNumber.format(totalBillWithTip);
       String stringTipPerPerson = roundNumber.format(tipPerPerson);
       String stringTotalPerPerson = roundNumber.format(totalPerPerson);

        //Printing out the information to the user
        System.out.println("The total tip amount is $" + stringTotalTipAmount);
        System.out.println("The total bill including tip is $" + stringTotalBillWithTip);
        System.out.println("The tip per person is $" + stringTipPerPerson);
        System.out.println("The total per person is $" + stringTotalPerPerson);

    }
}