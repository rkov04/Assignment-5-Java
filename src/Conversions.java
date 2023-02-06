import java.util.Scanner;
public class Conversions
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to unit converter");

        Scanner scnr = new Scanner(System.in);

        String userInput = "";

        while(!userInput.equals("exit"))
        {
            System.out.println("Please input your desired conversion: g = oz, kg = lb, mm = in, km = mi");
            System.out.println("Enter 'exit' to exit the program");
            userInput = scnr.nextLine();

            if(userInput.equals("g = oz"))
            {
                grams(scnr);
            }

            else if(userInput.equals("kg = lb"))
            {
                kilograms(scnr);
            }

            else if(userInput.equals("mm = in"))
            {
                millimeters(scnr);
            }

            else if(userInput.equals("km = mi"))
            {
                kilometers(scnr);
            }

            else if(userInput.equals("exit"))
            {
                break;
            }

            else
            {
                System.out.println("Input not readable. Please enter a converstion.");
            }

        }
    }

    public static void grams(Scanner scnr)
    {
        String userInput = "";
        System.out.println("Please enter the the amount of grams, or 'exit' for a different conversion.");
        Float myAmount = (float) 0.0;
        userInput = scnr.nextLine();
        if(!userInput.equals("exit"))
        {
            System.out.println("Grams = " + userInput);
            myAmount = TryParseFloat(userInput);
            if(myAmount == null)
            {
                System.out.println("Bad input " + userInput);
            }
            else 
            {
                Float myOunce = (float) (myAmount * 0.035);
                System.out.println("Ounces = " + myOunce);
            }
            
        }
    }

    public static void kilograms(Scanner scnr)
    {
        String userInput = "";
        System.out.println("Please enter the the amount of kilograms, or 'exit' for a different conversion.");
        Float myAmount = (float) 0.0;
        userInput = scnr.nextLine();
        if(!userInput.equals("exit"))
        {
            System.out.println("Kilograms = " + userInput);
            myAmount = TryParseFloat(userInput);
            if(myAmount == null)
            {
                System.out.println("Bad input " + userInput);
            }
            else 
            {
                Float myPounds = (float) (myAmount * 2.205);
                System.out.println("Pounds = " + myPounds);
            }
        }
    }

    public static void millimeters(Scanner scnr)
    {
        String userInput = "";
        System.out.println("Please enter the the amount of millimeters, or 'exit' for a different conversion.");
        Float myAmount = (float) 0.0;
        userInput = scnr.nextLine();
        if(!userInput.equals("exit"))
        {
            System.out.println("Millimeters = " + userInput);
            myAmount = TryParseFloat(userInput);
            if(myAmount == null)
            {
                System.out.println("Bad input " + userInput);
            }
            else 
            {
                Float myInches = (float) (myAmount * 0.039);
                System.out.println("Inches = " + myInches);
            }
        }
    }

    public static void kilometers(Scanner scnr)
    {
        String userInput = "";
        System.out.println("Please enter the the amount of millimeters, or 'exit' for a different conversion.");
        Float myAmount = (float) 0.0;
        userInput = scnr.nextLine();
        if(!userInput.equals("exit"))
        {
            System.out.println("Kilometers = " + userInput);
            myAmount = TryParseFloat(userInput);
            if(myAmount == null)
            {
                System.out.println("Bad input " + userInput);
            }
            else 
            {
                Float myMiles = (float) (myAmount * 0.621);
                System.out.println("Miles = " + myMiles);
            }
        }
    }

    public static Float TryParseFloat(String myFloat)
    {
        try
        {
            return Float.parseFloat(myFloat);
        }
        catch (NumberFormatException ex)
        {
            return null;
        }
    }
}

