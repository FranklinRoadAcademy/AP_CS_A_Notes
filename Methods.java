public class Methods{
  public static void main(String[] args)
  {
    /* 
    What is a method?
    
    In Java, a method is a chunk of code with specific syntax (name / header, body) 
    Roughly, there are TWO ways to think about methods in programming
    
    First, we can think of them as mathematical functions, as in, they have inputs, and do something to them to produce an output of some kind
    Examples would be a String that would be printed as an output, or two numbers where the output will be one to the power of the other. 

    Second, we can think of methods as the building blocks of programs. Every Java program consists of multiple steps, or procedures, that are accomplished
    by individual methods. 
    For example, we might need to read in some values from a user, do some math with them, and print those out.
    Each of those individual steps in our procedure might be a method. 
    */

    /*
    Method Headers

    We declare methods in a very particular way: 
      1      2   3       4
    public void foo (parameters) {
    <body>;
    }

    1) Is a modifier that determines where our method can be used in our program and in this case we made it public which allows for our method to be useable in all parts of our program.     
    
    2) Determines if our method is data returning or not. Void indicates that the method does not output a particular value. It might still do something, like print an output to the user.
        An example of a void method is println(), while an example of a method that returns (outputs to the computer) a value, would be Math.max() or Math.round()
        In the case of a data returning method, you would indicate the type of data you would like to return
        For example:
        public String concatenate ()
        {    <body>    }

        The String in the method header indicates the method will return a String value, a method can only return one thing of the determined type.

    3) The name of the method and all have names. We don't capitalize the first character of any method name, and we try to make our method names informative and typically are action-orientated.

    4) These are our parameters which are the inputs into our method. This is data that our method needs to work. 
        For example, "Hello, World!" is the parameter in the method:
        System.out.println("Hello, World!"); 
    
        Some methods don't have any parameters, and some methods have multiple. 
    */

    /*
    Calling Methods

    We call methods by writing name(parameters). 
    When we use this specific syntax, Java knows to execute the body of the method with that particular name.  

    Below, we call the printHello() method. 
    */
    
    printHello();

    /*
    Parameters

    A parameter are values that let us generalize a particular task. 
    For example, length, width, and height were parameters for the ribbon problem on Lab 5. 
    This is because those concepts let us perform the task of calculating ribbon length for *any* box. 
    
    Mathematically, parameters are inputs into a function.

    Functionally, parameters, and any variables declared inside a method, only exist "inside" that method. 
    You won't be able to access, or change them, outside of that method. 

    In the code below, a, b, and sum only exist inside the scope ("world") of add(5,4).
    Once add(5,4) finishes executing, those variables cease to exist. 

    If we use variables as parameters for a particular method call, copies of those variables are made inside the method. 

    The fact that parameters are "local" has a significant drawback. It means that we can't use parameters to get values out of a method
    The only way we can retrieve values from a method is by returning (outputting) them. 
    For an example of this, refer to the doubleNumber() example in the textbook. 
    */

    
    /*
    int result = add(5, 4);
    System.out.println(sum);
    System.out.println(result);

    int first = 7;
    int second = 6;
    int result = add(first, second);
    System.out.println(sum);
    System.out.println(result);    
    //*/
    
        
    /*
    Returning Values 

    Some methods return values. 
    These values can be used by your program even after the method ends. 

    The type of variable that a method returns is defined in the method header

    public static int add(int a, int b)

    When you are ready to return a value you must use the keyword return followed by the value you wish to return.
    This will immediately stop your method at this point and return the value back to where the method was originally called.
    */

    /*
    int result = add(-2, 5);
    System.out.println(result);
    //*/

    /* 
    Overloading Methods

    Methods are very picky about their parameters. If a method only accepts integers as an input, and we give it a double, we'll have issues.

    However, we might want to allow for more optionality for the inputs of our methods. 
    For a method that calculates distance, we  might want both integers and doubles to be inputs
    So, we write two versions of distance(), one with integers as parameters and one with doubles
    Java can figure out which one to run when you call distance(). 

    System.out.println() is an example of an overloaded method. 
    */

    /*    
    double distance = distance(3, 3, 4, 4);
    System.out.println("The int distance is: " + distance);`

    double distance = distance(3.2, 3.1, 4.9, 4.7);
    System.out.println("The double distance is: " + distance);
    //*/

    /*
    Composing Methods

    Composing methods is very powerful.
    In math, we can compose functions by using the output of one as the input of another.
    We can do the same in Java.

    If a method does a particular task like finding the length of a String,
    another does something else, like comparing two integers,
    and a third does something else, like printing out an integer,
    we can combine these two methods to do something more complex. 

    Under this framework, we can see it's really important to understand that methods are flexible and really the building blocks of programs. 
    */

    /*
    String s = "Gao";
    String t = "Bounds";
    System.out.println(Math.max(s.length(), t.length()));
    //*/
  }

  public static void printHello()
  {
    System.out.println("Hello!");
    System.out.println("Methods are really cool!");
    System.out.println("Goodbye!");
  }

  public static int add(int a, int b)
  {
    int sum = a + b;
    return a + b;
  }

  public static double distance(int x1, int y1, int x2, int y2)
  {
    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    return dist;
  }

  public static double distance(double x1, double y1, double x2, double y2)
  {
    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    return dist;
  }
  
}
