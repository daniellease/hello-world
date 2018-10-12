import java.util.Scanner;

public class scientificcalculator
{
    public static void main(String[] args)
    {
        {
            Scanner scnr = new Scanner(System.in);

            //Creates variables for the two operands and the user's menu choice
            double firstOperand = 0;
            double secondOperand = 0;
            int menuChoice = 1;
            double results = 0;
            double currentResult = 0.0;
            int calculations = 0;

            while (menuChoice != 0)
            {
                // Prints the current result and the calculator menu
                if (menuChoice != 7)
                {
                    System.out.println("\nCurrent Result: " + currentResult);

                    System.out.println();

                    //Prints calculator menu
                    System.out.println("Calculator Menu");
                    System.out.println("---------------");
                    System.out.println("0. Exit Program");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3. Multiplication");
                    System.out.println("4. Division");
                    System.out.println("5. Exponentiation");
                    System.out.println("6. Logarithm");
                    System.out.println("7. Display Average");

                    System.out.println();
                }

                System.out.print("Enter Menu Selection: ");
                menuChoice = scnr.nextInt();

                // performs the operations of menu choice 7
                if (menuChoice == 7)
                {
                    if (calculations == 0)
                    {
                        System.out.println("\nError: No calculations yet to average!");
                        System.out.println();
                        System.out.print("Enter Menu Selection: ");
                        menuChoice = scnr.nextInt();
                    }
                    else
                    {
                        System.out.println("\nSum of calculations: " + results);
                        System.out.println("Number of calculations: " + calculations);
                        System.out.println("Average of calculations: " + ((Math.round(results / calculations * 100.0)) / 100.0) + "\n");
                        calculations = calculations + 1;
                        System.out.print("Enter Menu Selection: ");
                        menuChoice = scnr.nextInt();
                    }
                }

                // ensures that the menu choice is within range
                if (menuChoice > 0 && menuChoice <= 7)
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = scnr.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondOperand = scnr.nextDouble();
                }



                //Switch that performs all the operations and then prints them
                switch(menuChoice)
                {
                    case 0:
                        break;
                    case 1:
                        currentResult = (firstOperand + secondOperand);
                        results = results + (firstOperand + secondOperand);
                        calculations = calculations + 1;
                        break;
                    case 2:
                        currentResult = (firstOperand - secondOperand);
                        results = results + (firstOperand - secondOperand);
                        calculations = calculations + 1;
                        break;
                    case 3:
                        currentResult = (firstOperand * secondOperand);
                        results = results + (firstOperand * secondOperand);
                        calculations = calculations + 1;
                        break;
                    case 4:
                        currentResult = (firstOperand / secondOperand);
                        results = results + (firstOperand / secondOperand);
                        calculations = calculations + 1;
                        break;
                    case 5:
                        currentResult = Math.pow(firstOperand, secondOperand);
                        results = results + (Math.pow(firstOperand, secondOperand));
                        calculations = calculations + 1;
                        break;
                    case 6:
                        currentResult = Math.log(secondOperand) / (Math.log(firstOperand));
                        results =  results + (Math.log(secondOperand) / (Math.log(firstOperand)));
                        calculations = calculations + 1;
                        break;
                    // if menu choice is out of range
                    default:
                        System.out.println("\nError: Invalid selection!");
                        System.out.print("\nEnter Menu Selection: ");
                        menuChoice = scnr.nextInt();
                }


            }
            // print this statement when the user enters 0 (quit program)
            System.out.println("\nThanks for using this calculator. Goodbye!");
        }
    }
}
