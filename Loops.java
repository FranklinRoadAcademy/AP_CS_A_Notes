public class Loops
{
  public static void main(String[] args)
  {
    /*
    So far, we've focused on programming problems to do something a specific number of times (usually once).
    However, today we are going to learn about a specific construct
    that lets us loop over a specific code segment as many times as we want.

    This construct is a "while loop", and it will save us a lot of time and typing. It comes
    in two forms the first we will look at is the basic "while loop".
    
    
    It's defined as follows:
    
    while (<test>) {
    *statement*
    *statement*
    *statement*
    }

    
    Notice that the way we define a while loop is very similar to an if statement.
    We have a test, and we have a segment of code that runs as long as the test is true. 
    It's appropriate to think of a while loop as an upgraded if statement, 
    that can run a segment of code as many times as necessary.
    */

    /*
    int number = 1;
    while (number < 100) {
      System.out.println(number);
      number = number * 2;
    }
    // */

    /*
    String s = "Loops are cool";
    int i = 0;
    while (i < s.length()) {
      System.out.println(s.charAt(i));
    }
    // */

    /*
    int a = 1;
    while (a < 10) {
      System.out.println(a + 1);
    }
    // */

    /*
    Scanner input = new Scanner(System.in);
    
    while (true) {
    System.out.println("Enter a number divisible by 10");
    int test = input.nextInt();
    if (test % 10 == 0) {
      System.out.println("Thanks");
      break;
      }
    else {
      System.out.println("Try again");
      }
    }
  
    // */

    /*
    The other type of while loop is the "do-while loop". This offers very similar
    abilities as the while loop but importantly will run through the loop before it checks
    the boolean condition. 

    It's defined as follows:
    
    do {
    *statement*
    *statement*
    *statement*
    } while (<test>);    
    */

    /*
    Scanner input = new Scanner(System.in);
    
    do {
    System.out.println("Enter a number divisible by 10");
    int test = input.nextInt();
    if (test % 10 == 0) {
      System.out.println("Thanks");
      }
    else {
      System.out.println("Try again");
      }
    } while (test % 10 != 0);
  
    // */

    /*
    How might we have used a while loop or do-while loop for the Tic-Tac-Toe lab?
    */
  }

}
