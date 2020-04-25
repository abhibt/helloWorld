/*
Trying out exception handling.
Wanted to check if exception handling needs
to be done in the function where the exception
happened or in the calling function.
In both cases it worked fine.
*/


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //TestException();
    try
    {
      TestCall();
      System.out.println("Can I do something else now?");
    }
    catch(ArithmeticException ae)
    {
      System.out.println("TestException");
    }
    finally
    {
      System.out.println("Do Nothing");
    }
  }
  private static void TestCall()
  {
    int i = 0;
    int j = 10;
    int x = 0;
    x = j/i;
  }
  private static void TestException() 
  {
    int i = 0;
    int j = 10;
    int x = 0;
    try
    {
      x = j/i;
    }
    catch(ArithmeticException ae)
    {
      System.out.println("TestException");
    }
    finally
    {
      System.out.println("Do Nothing");
    }
    
  }
}