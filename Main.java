class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //TestException();
    try
    {
      TestCall();
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
    int i = 10;
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