import java.io.Console;


public class Calculator {

    public static void main(String[] args) {
    Console console = System.console();

        console.printf("Welcome to the calculator program! \n");
        String name = console.readLine("Enter your username: ");
        console.printf("Hello, %s!\n", name);

      while(true){


        try
        {
          String numberAsString = console.readLine("Please enter a number : ");
          int number = Integer.parseInt(numberAsString);

          String operation = console.readLine("Please enter an operation +/-/*/ : ");

          String numberTwoAsString = console.readLine("Please enter another number: ");
          int number2 = Integer.parseInt(numberTwoAsString);


          if(operation.equals("+"))
          {
           console.printf("The result is " + (number+number2));
          }
          else if(operation.equals("-"))
          {
           console.printf("The result is " + (number-number2));

          }else if(operation.equals("*"))
          {
           console.printf("The result is" + (number*number2));
          }




        }

        catch(NumberFormatException e)
        {
          console.printf("U have entered invalid input, Try again..\n ");
          continue;
        }


        String choice = console.readLine("Do u want to make a calculation again? Press Y or N\n");
        if(choice.equalsIgnoreCase("N"))
        {
          break;
        }
        else
        {
         continue;
        }



      }


    }










    }