public class fibonacci
{
   public static void main(String[] args)
   {
      int a = 1, num = 15, num1 = 0, num2 = 1;
      System.out.print("First " + num + " fibonacci sequence: ");
      while(a <= num)
      {
         System.out.print(num1 + " , ");
         int total = num1 + num2;
         num1 = num2;
         num2 = total;
         a++;
      }
   }
}

// public class FibonacciRecursion
// {
//    static int num1 = 0, num2 = 1, num3 = 0;
//    public static void main(String[] args)
//    {
//       System.out.print(num1 + " " + num2);
//       FibonacciRecursion obj = new FibonacciRecursion();
//       obj.fibonacciRecursive(14);
//    }
//    void fibonacciRecursive(int f)
//    {
//       if(f > 0)
//       {
//          num3 = num1 + num2;
//          System.out.print(" " + num3);
//          num1 = num2;
//          num2 = num3;
//          // fibonacci recursion
//          fibonacciRecursive(f - 1);
//       }
//    }
// }